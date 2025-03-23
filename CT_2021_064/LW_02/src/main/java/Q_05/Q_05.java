package Q_05;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Output the result
        System.out.println("Temperature in Celsius: " + String.format("%.2f", celsius));

        scanner.close();
    }
}

