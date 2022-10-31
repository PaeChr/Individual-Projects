public class Address
{

    private int number;
    private String name;
    private String type;
    private ZipCode zip;
    private String state;
    private int pobox;

    public Address()
    {
        this.number = 0;
        this.name = "N/a";
        this.type = "Unknown";
        this.zip = new ZipCode();
        this.state = "  ";
        this.pobox = 0;
    }

    public Address(int number, String name, String type, ZipCode zip, String state, int pobox)
    {
        this.number = number;
        this.setName(name);
        this.type = type;
        this.zip = zip;
        this.state = state;
        this.pobox = pobox;
    }

    public Address(ZipCode zip, int pobox)
    {
        this.number = 0;
        this.name = "N/a";
        this.type = "Unknown";
        this.zip = zip;
        this.state = "  ";
        this.pobox = pobox;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (!name.contains(" "))
        {
            this.name = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
        } else
        {
            int names = name.indexOf(" ");
            this.name = Character.toUpperCase(name.charAt(0)) + name.substring(1, names + 1).toLowerCase() + Character.toUpperCase(name.charAt(names + 1)) + name.substring(names + 2).toLowerCase();
        }
    }

    public String getType()
    {
        if (type == "Drive")
        {
            return "Dr.";
        } else if (type == "Avenue")
        {
            return "Ave.";
        } else if (type == "Street")
        {
            return "St.";
        } else
        {
            return type;
        }
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public ZipCode getZip()
    {
        return zip;
    }

    public void setZip(ZipCode zip)
    {
        this.zip = zip;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public int getPobox()
    {
        return pobox;
    }

    public void setPobox(int pobox)
    {
        this.pobox = pobox;
    }

    @Override
    public String toString()
    {
        return "Address {number=" + number + ", name=" + getName() + ", type=" + getType() + ", zip=" + zip + ", state=" + state + ", pobox=" + pobox + "}";
    }

}
