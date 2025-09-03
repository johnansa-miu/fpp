import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalc;

        do {
            System.out.print("Enter user type (R/C/I): ");
            char userType = scanner.next().toUpperCase().charAt(0);
            System.out.print("Enter units consumed: ");
            int units = scanner.nextInt();

            double rate = switch (userType) {
                case 'R' -> 0.12;
                case 'C' -> 0.20;
                case 'I' -> 0.35;
                default -> 0.00;
            };

            double billAmount = rate * units;

            System.out.println("=== Electricity Bill ===");
            System.out.println("User Type: " + userType);
            System.out.println("Units: " + units);
            System.out.printf("Bill Amount: $%.2f%n", billAmount);

            System.out.print("Do you want to calculate another bill? (y/n): ");
            continueCalc = scanner.next().toLowerCase();
        } while (continueCalc.equals("y"));

        System.out.println("Program End.");
    }
}