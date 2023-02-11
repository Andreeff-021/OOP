package seminar_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine store = new VendingMachine();

        store.addProduct(new Product("Lays", 123.45))
                .addProduct(new Product("Fanta", 80.0))
                .addProduct(new Product("Cola", 90.0))
                .addProduct(new Product("Snikers", 40.0))
                .addProduct(new Product("Mars", 50.0))
                .addProduct(new PerishableProduct("milk", 60.0, 3))
                .addProduct(new Beer("Baltica", 65, 4));

        System.out.println(store);


        System.out.println("Search Lays");
        System.out.println(store.findProduct("Lay"));

        System.out.println("We buying Lays!");
        store.buy("Lays", 123.45);
        System.out.println(store);

        System.out.println("We buying Cola!");
        store.buy("Cola", 90.0);
        System.out.println(store);

        System.out.println("We buying Snikers!");
        store.buy("Snikers", 40.0);
        System.out.println(store);

        store.buy("Baltica", 65.0);
        System.out.println(store);

    }
}
