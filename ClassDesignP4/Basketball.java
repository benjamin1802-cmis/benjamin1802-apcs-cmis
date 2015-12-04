public class Basketball
{
    private String team;
    private int playersoncourt;
    public Basketball ()
    {
        team = "Chicago Bulls";
        playersoncourt = 5;
    }
    public Basketball (String team, int playersooncourt)
    {
        this.team = team;
        this.playersoncourt = playersoncourt;
    }
    public String toString ()
    {
        String result = String.format ( "Team: %s\n" + "Players: %d", team, playersoncourt);
        return result;
    }
}