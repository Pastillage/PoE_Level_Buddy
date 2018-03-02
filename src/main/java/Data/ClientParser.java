package Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class ClientParser
{
    public static ArrayList<String> old_file = new ArrayList<>();
    public static ArrayList<String> new_file = new ArrayList<>();
    static boolean firstRun = true;
    static int nOld = 0;

    public static volatile String currentZone = "";
    public static volatile String currentLevel = "??";
    public static volatile String playerName = "";

    public final static String PATH = Settings.getINSTANCE().getClientTXT().getAbsolutePath();

    public static void coreLoop() throws IOException
    {
        nOld = countLines(PATH);
        StoreText();
        firstRun = false;
        //File f = new File(PATH);
        while (true)
        {
            int countLines = countLines(PATH);
            if (countLines > nOld)
            {
                nOld = countLines;
                StoreText();
            }
            try
            {
                Thread.sleep(Settings.getPollingRate());
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static int countLines(String filename) throws IOException
    {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try
        {
            byte[] c = new byte[1024];
            int count = 0;
            int readChars = 0;
            boolean empty = true;
            while ((readChars = is.read(c)) != -1)
            {
                empty = false;
                for (int i = 0; i < readChars; ++i)
                {
                    if (c[i] == '\n')
                    {
                        ++count;
                    }
                }
            }
            return (count == 0 && !empty) ? 1 : count;
        }
        finally
        {
            is.close();
        }
    }

    private static String parse_Zone(String in)
    {
        String[] parts = in.split(" Entering area ");
        //System.out.println("Current Zone: " + parts[1]);
        return parts[1];
    }

    public static void StoreText()
    {
        new_file = new ArrayList<>();
        File f = new File(Settings.getINSTANCE().getClientTXT().getAbsolutePath());

        try
        {
            InputStream is = new FileInputStream(f);
            Scanner sc = new Scanner(is);

            new_file = new ArrayList<>();
            // Store file in memory.
            while (sc.hasNextLine())
            {
                new_file.add(sc.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        if (new_file.size() > old_file.size())
        {
            int amount_of_new_lines = new_file.size() - old_file.size();
            //System.out.println("New Lines: " + amount_of_new_lines);

            for (int c = old_file.size(); c < new_file.size(); c++)
            {
                if (!firstRun)
                {
                    String temp_line = new_file.get(c);
                    System.out.println(temp_line);
                    if (temp_line.contains("Entering area"))
                        currentZone = parse_Zone(temp_line);
                    else if (temp_line.contains("is now level"))
                        nameAndLevelVerify(temp_line);
                    else if (temp_line.contains("Passive Skill Point"))
                        Settings.getINSTANCE().incrementPassivePoints();
                }
            }

            old_file = new ArrayList<>(new_file);
        }
    }



    private static void nameAndLevelVerify(String temp_line)
    {
        String[] split = temp_line.split(" is now level ");
        currentLevel = new String(split[1]);
        split = split[0].split("] : ");
        playerName = split[1];
    }
}
