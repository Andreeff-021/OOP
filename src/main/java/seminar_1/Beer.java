package seminar_1;

public class Beer extends Product{

    private Integer alcogol = 0;

    public Beer(String name, double price, Integer alcogol) {
        super(name, price);
        this.alcogol = alcogol;
    }

    @Override
    public String toString() {
        return String.format("%s alcogol = %d", super.toString(), alcogol);
    }
}
