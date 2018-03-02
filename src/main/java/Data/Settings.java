package Data;

import java.io.*;
import java.util.Properties;

/**
 *
 */
public final class Settings
{
    private static final Settings INSTANCE = new Settings();
    private static long polling_rate = 1000l;
    private File clientTXT = new File("C:\\Program Files\\Steam (x86)\\SteamApps\\common\\Path of Exile\\logs\\Client.txt");
    private CharacterClass characterClass = CharacterClass.Duelist;
    private String characterName = "";
    private String bandits = " Kill all the bandits for 2 Passive Skill Points!";
    private int passivePoints = 0;
    private String charLevel = "1";
    private int[] selectedGems = {  0,0,0,
                                    0,0,0,
                                    0,0,0,0};

    public static long getPollingRate()
    {
        return polling_rate;
    }

    public String getCharLevel()
    {
        return charLevel;
    }

    public void setCharLevel(String charLevel)
    {
        this.charLevel = charLevel;
    }

    public void setBandits(String bandits)
    {
        this.bandits = bandits;
    }

    public void saveData()
    {
        Properties save = new Properties();
        OutputStream outputStream = null;

        try
        {
            outputStream = new FileOutputStream("save.riz");

            System.out.println(clientTXT.getAbsolutePath());

            save.setProperty("charName", characterName);
            save.setProperty("path", clientTXT.getAbsolutePath());
            save.setProperty("charClass", characterClass.toString());
            save.setProperty("sGems", stringifySelectedGems());
            save.setProperty("polling", polling_rate + "");
            save.setProperty("act2", bandits);
            save.setProperty("passives", passivePoints + "");
            save.setProperty("level", charLevel);

            save.store(outputStream, "Feel free to modify these settings, IF you know what you are doing.");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (outputStream != null)
            {
                try
                {
                    outputStream.close();
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }

    public int getPassivePoints()
    {
        return passivePoints;
    }

    public void setPassivePoints(int passivePoints)
    {
        this.passivePoints = passivePoints;
    }

    public void incrementPassivePoints()
    {
        passivePoints++;
    }

    public void loadSaveData()
    {
        Properties savedata = new Properties();
        InputStream inputStream = null;

        try
        {
            inputStream = new FileInputStream("save.riz");
            savedata.load(inputStream);

            characterName = savedata.getProperty("charName", characterName);
            clientTXT = new File((String) savedata.get("path"));
            characterClass = decodeCharClass(savedata.getProperty("charClass"));
            selectedGems = decodeArray(savedata.getProperty("sGems"));
            polling_rate = Long.parseLong(savedata.getProperty("polling"));
            charLevel = savedata.getProperty("level");
            bandits = savedata.getProperty("act2");
            passivePoints = Integer.parseInt(savedata.getProperty("passives"));
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if (inputStream != null)
            {
                try
                {
                    inputStream.close();
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
    }

    private CharacterClass decodeCharClass(String str)
    {
        switch (str)
        {
            case "Duelist" : return CharacterClass.Duelist;
            case "Marauder" : return CharacterClass.Marauder;
            case "Shadow" : return CharacterClass.Shadow;
            case "Scion" : return CharacterClass.Scion;
            case "Witch" : return CharacterClass.Witch;
            case "Ranger" : return CharacterClass.Ranger;
            case "Templar" : return CharacterClass.Templar;
            default: return CharacterClass.Duelist;
        }
    }

    private int[] decodeArray(String in)
    {
        String[] split = in.split(",");

        int[] res = new int[10];

        for (int c = 0; c < res.length; c++)
        {
            res[c] = Integer.parseInt(split[c]);
        }

        return res;
    }

    private String stringifySelectedGems()
    {
        String result = "";
        for (int i : selectedGems)
        {
            result += i + ",";
        }
        return result;
    }

    public int getBanditChoice()
    {
        if (bandits.contains(" Kill all"))
        {
            return 0;
        }
        else if (bandits.contains(" Help Alira"))
        {
            return 3;
        }
        else if (bandits.contains( "Help Oak"))
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public void loadData()
    {

    }

    private Settings()
    {
    }

    public static Settings getINSTANCE()
    {
        return INSTANCE;
    }

    public File getClientTXT()
    {
        return clientTXT;
    }

    public void setClientTXT(File clientTXT)
    {
        this.clientTXT = clientTXT;
    }

    public CharacterClass getCharacterClass()
    {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass)
    {
        this.characterClass = characterClass;
    }

    public String getCharacterName()
    {
        return characterName;
    }

    public void setCharacterName(String characterName)
    {
        this.characterName = characterName;
    }

    public int[] getSelectedGems()
    {
        return selectedGems;
    }

    public void setSelectedGems(int[] selectedGems)
    {
        this.selectedGems = selectedGems;
    }
}
