package lab4.problem1;

public class Clothing extends Product {
    private final String brand;
    private final int discount;

    public Clothing(String productName, double price, String brand, int discount) {
        super(productName, price);
        this.brand = brand;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        return originalPrice - (originalPrice * discount / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Discount: " + discount + "%, Final Price: " + String.format("%.2f", getPrice()) + "]";
    }
}
