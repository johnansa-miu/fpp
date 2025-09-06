package problem4;

public class Pizza {
    private final PizzaSize size;
    private final PizzaType type;
    private final int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        double sizePrice = switch (size) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typePrice = switch (type) {
            case VEGGIE -> 1.0;
            case PEPPERONI, BBQ_CHICKEN -> 2.0;
            case CHEEZE -> 1.5;
        };

        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double tax = price * 0.03;
        double totalPrice = price + tax;

        return String.format("""
            Pizza Order:
            Size: %s
            Type: %s
            Qty: %d
            Price: $%.2f
            Tax: $%.2f
            Total Price: $%.2f
            """, size, type, quantity, price, tax, totalPrice);
    }
}
