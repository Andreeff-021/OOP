package seminar_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private Double monye = 0.0;
    public Double getMonye() {
        return monye;
    }

    List<Product> products = new ArrayList<>();
    public List<Product> getProducts() {
        return products;
    }

    public VendingMachine addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public Product findProduct(String name) {
        for(Product prod : getProducts()) {
            if (prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
    }

    public Product buy (String name, Double price){
        Product something = findProduct(name);
        if (something == null) return null;
        if (price == something.getPrice()) {
            products.remove(something);
            monye += price;
            System.out.println("\nКупили " + name);
            return something;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder wdProducts = new StringBuilder();
        for (Product prod : this.getProducts()){
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(monye);
        return wdProducts.toString();
    }


}
