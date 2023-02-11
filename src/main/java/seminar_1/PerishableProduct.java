package seminar_1;

public class PerishableProduct extends Product {

    private Integer expirationDate;
    public PerishableProduct(String name, double price, Integer expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return String.format("%s expiration date = %d", super.toString(), expirationDate);
    }
}
