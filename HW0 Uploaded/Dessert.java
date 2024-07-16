public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
    }

    public void printDessert() {
        System.out.println("Flavor: " + flavor
                + "\nPrice: " + price
                + "\nQuantity so far: " + numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
