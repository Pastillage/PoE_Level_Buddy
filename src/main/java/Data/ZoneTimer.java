package Data;

/**
 *
 */
public class ZoneTimer
{
    private ActZones zoneName;
    private Timer t = new Timer();
    private Thread t_timer;
    private boolean stop_timer;

    public ZoneTimer(ActZones zoneName)
    {
        this.zoneName = zoneName;

        Runnable r = () ->
        {
            while (true)
            {
                if (!stop_timer)
                {
                    increment();
                }
                try
                {
                    Thread.sleep(1000l);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        t_timer = new Thread(r);
        t_timer.setDaemon(true);
        t_timer.start();
    }

    public void increment()
    {
        t.increment();
    }

    public void leftZone()
    {
        stop_timer = true;
    }

    public void enteredZone()
    {
        stop_timer = false;
    }
}
