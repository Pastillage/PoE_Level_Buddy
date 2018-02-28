package Data;

import java.io.File;

/**
 *
 */
public final class Settings
{
    private static final Settings INSTANCE = new Settings();
    private File clientTXT = new File("C:\\Program Files\\Steam (x86)\\SteamApps\\common\\Path of Exile\\logs\\Client.txt");
    private CharacterClass characterClass = CharacterClass.Duelist;
    private String characterName = "";


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
}
