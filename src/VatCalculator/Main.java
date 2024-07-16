package VatCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products products = new Products();
        Scanner scanner = new Scanner(System.in);

        products.displayProducts();
        System.out.print("Almak istediğiniz ürünü seçin: ");

        int choice = scanner.nextInt() - 1;
        Product selectedProduct = products.getProduct(choice);

        if (selectedProduct != null) {
            System.out.println("Seçilen Ürün: " + selectedProduct.getName());
            System.out.println("Fiyat: $" + selectedProduct.getPrice());
            System.out.println("KDV Oranı: " + selectedProduct.getVatRate() + "%");
            System.out.println("KDV Tutarı: $" + selectedProduct.calculateVAT());
            System.out.println("Toplam Fiyat: $" + selectedProduct.calculateTotalPrice());
        } else {
            System.out.println("Geçersiz ürün numarası!");
        }

        scanner.close();

    }
}
