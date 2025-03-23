package Q_09;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in %: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int years = scanner.nextInt();

        // Calculate final investment value
        double finalAmount = principal * Math.pow(1 + (rate / 100), years);

        // Output result
        System.out.println("Your investment will grow to: $" + String.format("%.2f", finalAmount));

        scanner.close();
    }
}
