package Data;

/**
 *
 */
public class Timer
{
    public volatile int hours = 0;
    public volatile int mins = 0;
    public volatile int sec = 0;

    public Timer(int hours, int mins, int sec)
    {
        this.hours = hours;
        this.mins = mins;
        this.sec = sec;
    }

    public Timer()
    {
        hours = 0;
        mins = 0;
        sec = 0;
    }

    public void increment()
    {
        sec++;
        if (sec == 60)
        {
            mins++;
            sec = 0;
            if (mins == 60)
            {
                mins = 0;
                hours++;
            }
        }
    }

    public void timer_start()
    {
        Runnable r = () ->
        {
            while (true)
            {
                increment();
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t_Session_Timer = new Thread(r);
        t_Session_Timer.setDaemon(true);
        t_Session_Timer.start();
    }

    public String getHours()
    {
        return fixTime(hours);
    }

    public String getMins()
    {
        return fixTime(mins);
    }

    public String getSec()
    {
        return fixTime(sec);
    }

    private String fixTime(int n)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if (n >= 0 && n <= 9)
            stringBuilder.append('0');
        stringBuilder.append(n);
        return stringBuilder.toString();
    }
}
