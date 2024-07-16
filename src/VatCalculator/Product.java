package VatCalculator;

public class Product {
    private String name;
    private double price;
    private double vatRate;

    public Product(String name, double price, double vatRate) {
        this.name = name;
        this.price = price;
        this.vatRate = vatRate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVatRate() {
        return vatRate;
    }

    public double calculateVAT(){
        return price * vatRate / 100;
    }

    public double calculateTotalPrice(){
        return price + calculateVAT();
    }

}
