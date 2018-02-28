package Data;

/**
 *
 */
public final class Flags
{
    private int currentActiveAct = 1;

    private static final Flags INSTANCE = new Flags();

    private Flags()
    {
    }

    public static Flags getINSTANCE()
    {
        return INSTANCE;
    }

    public int getCurrentActiveAct()
    {
        return currentActiveAct;
    }

    public void setCurrentActiveAct(int currentActiveAct)
    {
        this.currentActiveAct = currentActiveAct;
    }
}
