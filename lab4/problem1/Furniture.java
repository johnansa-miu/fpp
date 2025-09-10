package lab4.problem1;

public class Furniture extends Product {
    private final String material;
    private final double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    public String getMaterial() {
        return material;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + ", Shipping Cost: " + String.format("%.2f", shippingCost) + ", Final Price: " + String.format("%.2f", getPrice())+ "]";
    }
}
