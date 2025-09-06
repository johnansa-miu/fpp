public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Joe", "Smith", "332-221-4444");
        c1.setBillingAddress(new Address("1000 St", "Chicago", "IL", "60601"));
        c1.setShippingAddress(new Address("2000 St", "New York", "NY", "10001"));

        Customer c2 = new Customer("Mary", "Johnson", "111-222-3333");
        c2.setBillingAddress(new Address("3000 St", "Los Angeles", "CA", "90001"));
        c2.setShippingAddress(new Address("4000 St", "Chicago", "IL", "60605"));

        Customer c3 = new Customer("James", "Brown", "444-555-6666");
        c3.setBillingAddress(new Address("5000 St", "Houston", "TX", "77001"));
        c3.setShippingAddress(new Address("6000 St", "Dallas", "TX", "75001"));

        Customer[] customers = {c1, c2, c3};

        System.out.println("Customers with billing address in Chicago city:");
        for (Customer c : customers) {
            Address billingAddress = c.getBillingAddress();
            String city = billingAddress.getCity();
            if (city.equalsIgnoreCase("Chicago")) {
                System.out.println(c);
            }
        }
    }
}