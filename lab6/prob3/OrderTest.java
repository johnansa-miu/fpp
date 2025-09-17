package lab6.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)
        // a) Create an ArrayList<Order>
        List<Order> orders = new ArrayList<>();
        System.out.println("a) Initial list:");
        printOrders(orders);

        // b) Add at least five Order objects
        orders.add(new Order("1001", "John", 45.0));
        orders.add(new Order("1002", "Tanveer", 75.0));
        orders.add(new Order("1003", "Badri", 30.0));
        orders.add(new Order("1004", "David", 60.0));
        orders.add(new Order("1005", "Khanh", 90.0));
        System.out.println("\nb) After adding 5 orders:");
        printOrders(orders);

        // c) Delete an object by instance
        Order toRemove = new Order("1003", "Badri", 30.0);
        orders.remove(toRemove);
        System.out.println("\nc) After removing order with ID 1003:");
        printOrders(orders);

        // d) Print the size of the list
        System.out.println("\nd) Size of the list: " + orders.size());

        // e) Retrieve an Order by position and print it
        Order retrieved = orders.get(1);
        System.out.println("\ne) Order at index 1: " + retrieved);

        // f) Update the details of an Order by position
        orders.set(1, new Order("1002", "Tanveer Updated", 80.0));
        System.out.println("\nf) After updating order at index 1:");
        printOrders(orders);

        // g) Override equals() already implemented in Order.java

        // h) Sort by totalAmount (ascending) using a Comparator
        orders.sort(Comparator.comparingDouble(Order::getTotalAmount));
        System.out.println("\nh) After sorting by totalAmount:");
        printOrders(orders);

        // i) Filter orders with totalAmount > 50.0 and sort by customerName
        List<Order> filteredOrders = listMoreThan50(orders);
        filteredOrders.sort(Comparator.comparing(Order::getCustomerName));
        System.out.println("\ni) Orders with totalAmount > 50.0, sorted by customerName:");
        printOrders(filteredOrders);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        List<Order> filtered = new ArrayList<>();
        for (Order order : list) {
            if (order != null && order.getTotalAmount() > 50.0) {
                filtered.add(order);
            }
        }
        return filtered;
    }

    private static void printOrders(List<Order> list) {
        for (Order order : list) {
            System.out.println(order);
        }
    }
}
