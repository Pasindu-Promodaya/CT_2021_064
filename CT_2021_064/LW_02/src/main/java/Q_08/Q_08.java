package Q_08;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate volume using formula V = (4/3) * π * r^3
        double volume = (4.0 / 3) * 3.14 * Math.pow(radius, 3);

        // Output result
        System.out.println("The volume of the sphere is: " + String.format("%.2f", volume));

        scanner.close();
    }
}
