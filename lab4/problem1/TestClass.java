package lab4.problem1;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Electronics("Washing Machine", 1000.0, 12, 50.0);
        products[1] = new Furniture("Bed Frame", 150.0, "wood", 20.0);
        products[2] = new Clothing("Winter Jacket", 50.0, "Levis", 10);
        products[3] = new Electronics("Phone", 500.0, 6, 30.0);
        products[4] = new Furniture("TV Stand", 300.0, "steel", 40.0);

        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println();
        double sum = sumProducts(products);
        System.out.println("Sum of all product prices: $" + sum);
    }

    public static double sumProducts(Product[] col) {
        if (col == null) return 0.0;
        double sum = 0.0;
        for (Product p : col) {
            if (p != null) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
