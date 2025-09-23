package lab9.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int quantity = 0;

        while (!validInput) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();

                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50");
                }

                System.out.println("Successfully added " + quantity + " items to your cart!");
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer number.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }
}
