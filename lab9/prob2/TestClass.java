package lab9.prob2;

public class TestClass {
    public static void main(String[] args) {

        CustomerAccount account = new CustomerAccount("John Doe", "ACC123456", 500.0);

        System.out.println("=== Testing Exception Handling ===");
        System.out.println("Account Holder: " + account.getCusName());
        System.out.println("Account Number: " + account.getAccNo());
        System.out.println("Initial Balance: $" + account.getBalance());
        System.out.println();

        System.out.println("Test 1: Deposit with negative amount");
        try {
            account.deposit(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Test 2: Withdraw more than balance");
        try {
            account.withdraw(600.0);
        } catch (AccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Test 3: Withdraw amount that would drop balance below $100");
        try {
            account.withdraw(450.0);
        } catch (AccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Test 4: Successful transactions");
        try {
            System.out.println("Current balance: $" + account.getBalance());
            account.deposit(200.0);
            System.out.println("Balance after deposit: $" + account.getBalance());
            account.withdraw(300.0);
            System.out.println("Balance after withdrawal: $" + account.getBalance());
            System.out.println("All successful transactions completed!");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n=== Final Balance: $" + account.getBalance() + " ===");
    }
}
