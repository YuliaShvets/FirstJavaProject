package ua.lviv.iot;

public class Main {

    public static void main(String[] args)
    {
        Elamp Xiaomi = new Elamp("Xiaomi", "6Вт", 1266, "China", "12 months", "Xiaomi");
        Elamp Lightrich = new Elamp("Lightrich", "5Вт", 1500, "German", "12 months", "Light");
        Elamp Feron = new Elamp("Feron", "4Вт", 1000, "England", "12 months", "SunShine");

        System.out.println(Xiaomi.toString());
        System.out.println(Lightrich.toString());
        System.out.println(Feron.toString());

        
    }
}
