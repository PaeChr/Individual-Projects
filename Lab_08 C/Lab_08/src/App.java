/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author changwoo
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // alt + insert = constructor

        ZipCode zipCode = new ZipCode("16802", "0001");
        Address address = new Address(210, "Old Main", "Street", zipCode, "PA", 0);

        SoccerPlayer[] soccerArray = new SoccerPlayer[5];

        soccerArray[0] = new SoccerPlayer("Julia Dohle", address, 1, "Soccer", 10, 2, 0);
        soccerArray[1] = new SoccerPlayer("Ellie Jean", address, 14, "Soccer", 2, 7, 0);
        soccerArray[2] = new SoccerPlayer("Devon Olive", address, 15, "Soccer", 5, 3, 3);
        soccerArray[3] = new SoccerPlayer("Angela Aguero", address, 20, "Soccer", 11, 7, 5);
        soccerArray[4] = new SoccerPlayer("Laura Suero", address, 33, "Soccer", 1, 4, 3);

        for (int index = 0; index < soccerArray.length; index++)
        {
            System.out.println(soccerArray[index].toString());
        }
        int maxRatingIndex = 0;

        for (int index = 1; index < soccerArray.length; index++)
        {
            if (soccerArray[index].getRating() > soccerArray[maxRatingIndex].getRating())
            {
                maxRatingIndex = index;
            }
        }

        System.out.println("\n" + soccerArray[maxRatingIndex].getName()
                + " has the highest ratings, which is " + soccerArray[maxRatingIndex].getRating());
    }
}
