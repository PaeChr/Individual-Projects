/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author changwoo
 */
public class SoccerPlayer extends Player
{

    private int goals;
    private int yellowCards;

    public SoccerPlayer()
    {
        super();
        this.goals = 0;
        this.yellowCards = 0;
    }

    public SoccerPlayer(int goals, int yellowCards)
    {
        super();
        this.goals = goals;
        this.yellowCards = yellowCards;
    }

    public SoccerPlayer(String name, Address address, int number, String sports, int gamesPlayed, int goals, int yellowCards)
    {
        super(name, address, number, sports, gamesPlayed);
        this.goals = goals;
        this.yellowCards = yellowCards;
    }

    public int getGoals()
    {
        return goals;
    }

    public void setGoals(int goals)
    {
        this.goals = goals;
    }

    public int getYellowCards()
    {
        return yellowCards;
    }

    public void setYelloCards(int yellowCards)
    {
        this.yellowCards = yellowCards;
    }

    public double getRating()
    {
        if (goals == 0 || getGamesPlayed() == 0)
        {
            return 0;
        } else
        {
            return (double) (goals - yellowCards) / getGamesPlayed();
        }

    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" + "SoccerPlayer{goals=" + getGoals() + ", yellowCards=" + yellowCards + ",rating= " + getRating() + "}" + "\n======================================================";
    }

}
