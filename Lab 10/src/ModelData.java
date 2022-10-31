import java.util.ArrayList;

public final class ModelData
{

    private final ArrayList<Player> players;

    public ModelData()
    {
        players = new ArrayList<>();
        this.LoadPlayers();
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    public void LoadPlayers()
    {
        ZipCode zip = new ZipCode("16802", "0001");
        Address address = new Address(201, "Old Main", "Street", zip, "PA", 0);

        Player FootballPlayer1 = new FootballPlayer("Saquon Barkley", address, 1, "Football", 10, 80, 220);
        players.add(FootballPlayer1);

        Player FootballPlayer2 = new FootballPlayer("John Dunmore", address, 14, "Football", 7, 120, 100);
        players.add(FootballPlayer2);

        Player FootballPlayer3 = new FootballPlayer("Daniel George", address, 15, "Football", 5, 10, 70);
        players.add(FootballPlayer3);

        Player FootballPlayer4 = new FootballPlayer("Will Levis", address, 20, "Football", 11, 30, 250);
        players.add(FootballPlayer4);

        Player FootballPlayer5 = new FootballPlayer("Jaden Dottin", address, 33, "Football", 14, 100, 100);
        players.add(FootballPlayer5);

        Player SoccerPlayer1 = new SoccerPlayer("Julia Dohle", address, 1, "Soccer", 10, 2, 0);
        players.add(SoccerPlayer1);

        Player SoccerPlayer2 = new SoccerPlayer("Ellie Jean", address, 14, "Soccer", 2, 7, 0);
        players.add(SoccerPlayer2);

        Player SoccerPlayer3 = new SoccerPlayer("Devon Olive", address, 15, "Soccer", 5, 3, 3);
        players.add(SoccerPlayer3);

        Player SoccerPlayer4 = new SoccerPlayer("Angela Aguero", address, 20, "Soccer", 11, 7, 5);
        players.add(SoccerPlayer4);

        Player SoccerPlayer5 = new SoccerPlayer("Laura Suero", address, 33, "Soccer", 1, 4, 3);
        players.add(SoccerPlayer5);
    }

    public Player findHighestRatings(String p)
    {
        double ratings = 0;
        int a = 0;
        for (int index = 0; index < players.size(); index++)
        {
            if (players.get(index).getSports().equals(p) && players.get(index).getRating() > ratings)
            {
                a = index;
                ratings = players.get(index).getRating();
            }
        }
        return players.get(a);
    }

    public boolean containsName(String name)
    {
        for (int index = 0; index < players.size(); index++)
        {
            if (players.get(index).getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsPartialName(String name)
    {
        for (int index = 0; index < players.size(); index++)
        {
            if (players.get(index).getName().indexOf(name) != -1)
            {
                return true;
            }
        }
        return false;
    }

    public Player findHighestYards()
    {
        int yards = 0;
        int a = 0;
        for (int index = 0; index < players.size(); index++)
        {
            if (players.get(index).getSports().equals("Football"))
            {
                FootballPlayer footballplayer = (FootballPlayer) players.get(index);
                if (footballplayer.getYards() > yards)
                {
                    a = index;
                    yards = footballplayer.getYards();
                }
            }
        }
        return players.get(a);
    }
}
