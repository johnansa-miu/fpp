import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int nTerm = input.nextInt();

        // Part (a): 1 - 1/3 + 1/5 - 1/7 + ...
        double sumA = 0.0;
        for (int i = 1; i <= nTerm; i++) {
            double term = 1.0 / (2 * i - 1);
            if (i % 2 == 0) {
                sumA -= term;
            } else {
                sumA += term;
            }
        }
        System.out.println("Result of series (a): " + String.format("%.4f", sumA));

        // Part (b): 1/2 - 2/4 + 3/8 - 4/16 + 5/32 - ...
        double sumB = 0.0;
        for (int i = 1; i <= nTerm; i++) {
            double term = (double) i / Math.pow(2, i);
            if (i % 2 == 0) {
                sumB -= term;
            } else {
                sumB += term;
            }
        }
        System.out.println("Result of series (b): " + String.format("%.4f", sumB));
    }
}
