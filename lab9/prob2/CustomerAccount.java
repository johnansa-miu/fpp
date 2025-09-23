package lab9.prob2;

public class CustomerAccount {
    private final String cusName;
    private final String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive. Attempted: $" + amount);
        }

        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance. "
                    + "Balance: $" + balance + ", Attempted: $" + amount);
        }

        if (balance - amount < 100) {
            throw new AccountException("Low balance warning! Balance cannot go below $100. "
                    + "Current balance: $" + balance + ", After withdrawal: $" + (balance - amount));
        }

        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getCusName() {
        return cusName;
    }

    public String getAccNo() {
        return accNo;
    }
}

