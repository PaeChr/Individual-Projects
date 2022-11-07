public class Player extends Person
{
    private int number;
    private String sports;
    private int gamesPlayed;

    public Player()
    {
        super();
        this.number = 0;
        this.sports = "none";
        this.gamesPlayed = 0;
    }

    public Player(int number, String sports, int gamesPlayes)
    {
        super();
        this.number = number;
        this.sports = sports;
        this.gamesPlayed = gamesPlayed;
    }

    public Player(String name, Address address, int number, String sports, int gamesPlayed)
    {
        super(name, address);
        this.number = number;
        this.sports = sports;
        this.gamesPlayed = gamesPlayed;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getSports()
    {
        return sports;
    }

    public void setSports(String sports)
    {
        this.sports = sports;
    }

    public int getGamesPlayed()
    {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gaemsPlayed)
    {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Player{" + "number=" + number + ", sports=" + sports + ", gamesPlayed=" + gamesPlayed + "}";
    }

}
