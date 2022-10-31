public class FootballPlayer extends Player
{

    private int yards;
    private int minutesPlayed;

    public FootballPlayer()
    {
        super();
        yards = 0;
        minutesPlayed = 0;
    }

    public FootballPlayer(String name, Address address, int number, String sports, int gamesPlayed, int yards, int minutesPlayed)
    {
        super(name, address, number, sports, gamesPlayed);
        this.yards = yards;
        this.minutesPlayed = minutesPlayed;
    }

    public int getYards()
    {
        return yards;
    }

    public void setYards(int yards)
    {
        this.yards = yards;
    }

    public int getMinutesPlayed()
    {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed)
    {
        this.minutesPlayed = minutesPlayed;
    }

    @Override
    public double getRating()
    {
         if(yards == 0 || getGamesPlayed() == 0)
        {
            return 0;
        } else
        {
            return (double) ((yards - minutesPlayed / 10.0)) / getGamesPlayed();
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" + "FootballPlayer{yards=" + getYards() + ", minutesPlayed=" + getMinutesPlayed() + ", ratings= " + String.format("%.2f",getRating()) + "}" + "\n======================================================";
    }
}


