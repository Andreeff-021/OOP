package seminar_1;

public class Discounted extends Product{
    private double sale = 0.0;

    public Discounted(String name, double price, double sale) {
        super(name, price);
        this.sale = sale;
    }
    

    @Override
    public String toString() {
        return String.format("%s sale = %2.2f", super.toString(), sale);
    }
}
