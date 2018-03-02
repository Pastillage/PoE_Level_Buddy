package Data;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;
import org.apache.commons.io.input.TailerListenerAdapter;

import java.io.File;


public class ClientParser {


    public static volatile String currentZone = "";
    public static volatile String currentLevel = "??";
    public static volatile String playerName = "";

    public final static String PATH = Settings.getINSTANCE().getClientTXT().getAbsolutePath();

    public static final String gameLogFile = PATH + "\\Client.txt";


    public static void init() {

        TailerListener listener = new LinesListener();
        File file = new File(gameLogFile);

        Tailer tailer = new Tailer(file, listener, 1000);
        tailer.run();

    }

    private static String parse_Zone(String in) {
        String[] parts = in.split(" Entering area ");
        //System.out.println("Current Zone: " + parts[1]);
        return parts[1];
    }


    private static void nameAndLevelVerify(String temp_line) {
        String[] split = temp_line.split(" is now level ");
        currentLevel = new String(split[1]);
        split = split[0].split("] : ");
        playerName = split[1];
    }

    static public class LinesListener extends TailerListenerAdapter {
        @Override
        public void handle(String line) {
          //  System.out.println(line);
            if (line.contains("Entering area"))
                currentZone = parse_Zone(line);
            else if (line.contains("is now level"))
                nameAndLevelVerify(line);
            else if (line.contains("Passive Skill Point"))
                Settings.getINSTANCE().incrementPassivePoints();
        }
    }
}
