package Q_07;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / Math.pow(height / 100.0, 2);

        // Output result
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        scanner.close();
    }
}

