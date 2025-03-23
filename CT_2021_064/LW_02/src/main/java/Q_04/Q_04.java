package Q_04;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter body weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        // Calculate daily calorie requirement
        double calories = bodyWeight * 19;

        // Output the result
        System.out.println("Calories needed per day: " + String.format("%.2f", calories));

        scanner.close();
    }
}

