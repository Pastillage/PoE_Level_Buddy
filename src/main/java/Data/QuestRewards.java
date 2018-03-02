package Data;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class QuestRewards
{
    private int id;
    private CharacterClass characterClass = null;
    private ArrayList<Gems> _reward = new ArrayList<>();

    public QuestRewards(int id, CharacterClass characterClass, Gems... reward)
    {
        this.id = id;
        this.characterClass = characterClass;
        _reward.addAll(Arrays.asList(reward));
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public CharacterClass getCharacterClass()
    {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass)
    {
        this.characterClass = characterClass;
    }

    public ArrayList<Gems> get_reward()
    {
        return _reward;
    }

    public void set_reward(ArrayList<Gems> _reward)
    {
        this._reward = _reward;
    }
}
