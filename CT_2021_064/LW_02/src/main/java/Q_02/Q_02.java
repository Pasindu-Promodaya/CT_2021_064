package Q_02;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        // Conversion calculations
        double inches = cm / 2.54;
        int feet = (int) (inches / 12); // Get the whole feet part
        double remainingInches = inches % 12; // Get the remaining inches

        // Output result
        System.out.println(cm + " cm is approximately " + feet + " feet and " + String.format("%.2f", remainingInches) + " inches.");

        scanner.close();
    }
}