public class App
{

    public static void main(String[] args)
    {
        Player p0 = new Player();

        ZipCode zipCode = new ZipCode("16802", "0001");
        Address address = new Address(10, "Old Main", "Street", zipCode, "PA", 0);

        Player p1 = new Player("Julia Dohle", address, 1, "Soccer", 5);

        System.out.println(p0);
        System.out.println(p1);

    }

}
