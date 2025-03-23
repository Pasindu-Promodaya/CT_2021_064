package Q_03;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (1.8 * celsius) + 32;

        // Output the result
        System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", fahrenheit));

        scanner.close();
    }
}