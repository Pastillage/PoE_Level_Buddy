package Data;

import java.util.ArrayList;

/**
 *
 */
public final class Flags
{
    private int currentActiveAct = 1;
    // 0 = Settings Other Numbers reserved for act zones (see ActZones enum)
    private int activeWindow = 0;

    private ArrayList<ActZones> visited = new ArrayList<>();

    private static final Flags INSTANCE = new Flags();

    private Flags()
    {
    }

    public void resetVisited()
    {
        visited = new ArrayList<>();
    }

    public void addVisitedZone(Zone z)
    {
        visited.add(z.getCode());
    }

    public boolean hasZoneBeenVisited(ActZones z)
    {
        return visited.contains(z);
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

    public int getActiveWindow()
    {
        return activeWindow;
    }

    public void setActiveWindow(int activeWindow)
    {
        this.activeWindow = activeWindow;
    }
}
