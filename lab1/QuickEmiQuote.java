import java.util.Random;

public class QuickEmiQuote {
    public static void main(String[] args) {
        Random random = new Random();

        int principal = random.nextInt(20001) + 5000;
        int tenure = random.nextInt(31) + 6;
        double apr = random.nextDouble() * 8.0 + 3.5;

        double monthlyRate = apr / 12 / 100;
        double futureValueFactor = Math.pow(1 + monthlyRate, tenure);
        double emi = principal * monthlyRate * futureValueFactor / (futureValueFactor - 1);
        double totalPayment = emi * tenure;
        double totalInterest = totalPayment - principal;

        int truncatedEmi = (int) emi;
        int roundedEmi = (int) Math.round(emi);

        System.out.println("=== EMI Quote Calculator ===");
        System.out.printf("Principal: $%,.2f%n", (double) principal);
        System.out.printf("Tenure: %d months%n", tenure);
        System.out.printf("APR: %.1f%%%n", apr);
        System.out.printf("Monthly Rate: %.4f%n", monthlyRate);
        System.out.printf("Monthly EMI: $%,.2f%n", emi);
        System.out.printf("Total Payment: $%,.2f%n", totalPayment);
        System.out.printf("Total Interest: $%,.2f%n", totalInterest);
        System.out.printf("EMI (Truncated): $%d%n", truncatedEmi);
        System.out.printf("EMI (Rounded): $%d%n", roundedEmi);
    }
}
