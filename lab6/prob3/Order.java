package lab6.prob3;

import java.util.Objects;

public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;

    public Order(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // getters/setters
    public String getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(orderId, order.orderId);
    }

    @Override
    public int hashCode() {
        // consistent with equals
        return orderId != null ? orderId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Order{" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }
}

