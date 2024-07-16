package VatCalculator;

public class VATCalculator {
    public double calculateVAT(double price, double vatRate){
        return price * vatRate / 100;
    }

    public double calculateTotalPrice(double price, double vat){
        return price + vat;
    }
}
