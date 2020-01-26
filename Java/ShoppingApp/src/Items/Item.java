package Items;

public class Item {
    //this is where we set what parameters items should have(price, colour etc)
    //main parameters are:
    private String name;//trousers
    private String colour;//black
    private String brand;//M&S
    private String size;//XS,S,M,L,XL,XXL
    private char gender;//M for male, F for female, B for boy, G for girl
    private double price;//3.50
    static int total =0;

    //item getters:
    public String getName(String name) { return name; }
    public String getColour(String colour) { return colour; }
    public String getBrand(String brand) { return brand; }
    public String getSize(String size) { return size; }
    public char getGender(char gender) { return gender; }

    public double getPrice(double price) { return price; }
}
