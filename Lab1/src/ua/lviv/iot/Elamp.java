package ua.lviv.iot;

public record Elamp(String name, String power, int cost, String prodCountry, String guarantee, String manufacturer)
{
    private static int totalPrice;

    public Elamp()
    {
        this("", "", 0, "", "", "");

    }

     public Elamp (String name, String power, int cost)
    {
        this(name, power, cost, "", "", "");
    }


     @Override
    public String toString()
     {
         return "Elamp :\n" + this.name + "\nManufacturer :\n" + this.manufacturer + "\nPower :\n" + this.power + "\nGuarantee :\n"
                 + this.guarantee + "\nCountry :\n" + this.prodCountry;
     }

     public static int getTotalPrice()
    {
        return totalPrice;
    }


}
