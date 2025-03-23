package Q_10;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MONTHS_IN_YEAR = 12;

        // Prompt user for input
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        // Calculate number of payments
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        // Calculate monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        // Calculate total payment
        double totalPayment = monthlyPayment * numberOfPayments;

        // Output results
        System.out.println("Monthly Payment: $" + String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: $" + String.format("%.2f", totalPayment));

        scanner.close();
    }
}
