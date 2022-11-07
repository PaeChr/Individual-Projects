/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author changwoo
 */
public class ZipCode
{

    //attributes
    //variables
    private String fiveDigit;
    private String plus4;

    public ZipCode() // No-parameter
    {
        fiveDigit = "00000";
        plus4 = "0000";
    }

    public ZipCode(String fiveDigit) // One-parameter
    {
        this.fiveDigit = fiveDigit;
        plus4 = "0000";
    }

    public ZipCode(String fiveDigit, String plus4) // Two-parameter
    {
        this.fiveDigit = fiveDigit;
        this.plus4 = plus4;
    }

    //Alt + insert - toString()
    @Override
    public String toString()
    {
        if (plus4.equals("0000"))
        {
            return fiveDigit;
        } else
        {
            return fiveDigit + "-" + plus4;

        }
    }

    public void display()
    {
        System.out.println(toString());

    }

    public void display(int p)
    {
        if (p == 1)
        {
            System.out.println("Prefix = " + fiveDigit.substring(0, 3));
        } else if (p == 2)
        {
            System.out.println("Area = " + fiveDigit.substring(3, 5));
        }

    }
}
