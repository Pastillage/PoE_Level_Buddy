package Data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 */
public class DataFactory
{
    public static ObservableList<CharacterClass> characterCombo()
    {
        ObservableList<CharacterClass> result = FXCollections.observableArrayList();
        result.addAll(CharacterClass.Duelist, CharacterClass.Marauder, CharacterClass.Ranger,
                CharacterClass.Scion, CharacterClass.Shadow, CharacterClass.Templar, CharacterClass.Witch);
        return result;
    }
}
