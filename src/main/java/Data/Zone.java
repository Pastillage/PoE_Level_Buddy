package Data;

/**
 *
 */
public class Zone
{
    private ActZones code;
    private String zoneName;
    private boolean visited;

    private boolean waypoint;
    private boolean skill_point_quest;
    private boolean respec_point_quest;
    private boolean trial_of_ascendency;

    public Zone(ActZones code, String zoneName, boolean visited, boolean waypoint, boolean skill_point_quest, boolean respec_point_quest, boolean trial_of_ascendency)
    {
        this.code = code;
        this.zoneName = zoneName;
        this.visited = visited;
        this.waypoint = waypoint;
        this.skill_point_quest = skill_point_quest;
        this.respec_point_quest = respec_point_quest;
        this.trial_of_ascendency = trial_of_ascendency;
    }

    public ActZones getCode()
    {
        return code;
    }

    public void setCode(ActZones code)
    {
        this.code = code;
    }

    public String getZoneName()
    {
        return zoneName;
    }

    public void setZoneName(String zoneName)
    {
        this.zoneName = zoneName;
    }

    public boolean isVisited()
    {
        return visited;
    }

    public void setVisited(boolean visited)
    {
        this.visited = visited;
    }

    public boolean isWaypoint()
    {
        return waypoint;
    }

    public void setWaypoint(boolean waypoint)
    {
        this.waypoint = waypoint;
    }

    public boolean isSkill_point_quest()
    {
        return skill_point_quest;
    }

    public void setSkill_point_quest(boolean skill_point_quest)
    {
        this.skill_point_quest = skill_point_quest;
    }

    public boolean isRespec_point_quest()
    {
        return respec_point_quest;
    }

    public void setRespec_point_quest(boolean respec_point_quest)
    {
        this.respec_point_quest = respec_point_quest;
    }

    public boolean isTrial_of_ascendency()
    {
        return trial_of_ascendency;
    }

    public void setTrial_of_ascendency(boolean trial_of_ascendency)
    {
        this.trial_of_ascendency = trial_of_ascendency;
    }
}
