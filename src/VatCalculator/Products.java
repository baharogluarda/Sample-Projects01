package VatCalculator;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> productList;

    public Products() {
        productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1000.0, 18.0));
        productList.add(new Product("Telefon", 500.0, 18.0));
        productList.add(new Product("Tablet", 300.0, 18.0));
    }

    public void displayProducts() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + productList.get(i).getName() + " - Fiyat: $" + productList.get(i).getPrice());
        }
    }

    public Product getProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        } else {
            return null;
        }
    }

}
