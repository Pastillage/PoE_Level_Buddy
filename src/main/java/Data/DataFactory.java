package Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

import static Data.CharacterClass.*;

/**
 *
 */
public class DataFactory
{
    public static ObservableList<CharacterClass> characterCombo()
    {
        ObservableList<CharacterClass> result = FXCollections.observableArrayList();
        result.addAll(Duelist, Marauder, Ranger,
                Scion, Shadow, Templar, Witch);
        return result;
    }

    public static ArrayList<QuestRewards> receiveQuests()
    {
        switch (Settings.getINSTANCE().getCharacterClass())
        {
            case Duelist: return Quests.initQuestsDuelist();
            case Marauder: return Quests.initQuestsMarauder();
            case Ranger: return Quests.initQuestsRanger();
            case Scion: return Quests.initQuestsScion();
            case Shadow: return Quests.initQuestsShadow();
            case Templar: return Quests.initQuestsTemplar();
            case Witch: return Quests.initQuestsWitch();
        }
        return Quests.initQuestsDuelist();
    }

    public static String questName(int value)
    {
        String res = "";
        switch (value)
        {                //  [GEM]
            case 0 : res = "[Tarkleigh]  Enemy at the Gate"; break;
            case 1 : res = "[Tarkleigh]  Breaking Some Eggs"; break;
            case 2 : res = "[Tarkleigh]  The Caged Brute"; break;
            case 3 : res = "  [Nessa]    The Siren's Cadence"; break;
            case 4 : res = "[Greust] Intruders in Black"; break;
            case 5 : res = " [Silk]  Sharp and Cruel"; break;
            case 6 : res = "[Maramoa] Sever the Right Hand"; break;
            case 7 : res = " [Siosa]  A Fixture of Fate"; break;
            case 8 : res = " [Oyun]  Breaking the Seal"; break;
            case 9 : res = "[Dialla] The Eternal Nightmare"; break;
        }
        return res;
    }
}
