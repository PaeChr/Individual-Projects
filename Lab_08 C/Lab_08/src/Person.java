/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author changwoo
 */
public class Person
{

    //attributes
    private String name;
    private Address address;

    //constructors
    public Person()
    {
        name = "John Doe";
        address = new Address();
    }

    public Person(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person{" + "name=" + name + ", address=" + address + "} ";
    }

}
