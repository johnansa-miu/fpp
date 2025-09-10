package lab4.problem1;

public class Electronics extends Product {
    private final int warranty;
    private final double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    public int getWarranty() {
        return warranty;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warranty + " months, Warranty Cost: " + String.format("%.2f", warrantyCost) + ", Final Price: " + String.format("%.2f", getPrice())+ "]";
    }
}
