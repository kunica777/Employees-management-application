package Items;
public class Items {
    public static void main(String[] args) {
        //this is where we create new items for sale
        Item item1 = new Item();
        item1.getName("T-shirt");
        item1.getPrice(10);
        item1.getGender('F');
        item1.getBrand("Nike");
        item1.getSize("S");
        item1.getColour("Pink");
        item1.total++;

        Item item2 = new Item();
        item2.getName("Dress");
        item2.getPrice(45);
        item2.getGender('F');
        item2.getBrand("Prada");
        item2.getSize("XS");
        item2.getColour("Black");
        item2.total++;

        Item item3 = new Item();
        item3.getName("Trousers");
        item3.getPrice(19);
        item3.getGender('B');
        item3.getBrand("Adidas");
        item3.getSize("M");
        item3.getColour("Blue");
        item3.total++;
        System.out.println("The total is: " + item3.total);
    }
}
