package Q_03;
import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inner and outer radii from the user
        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        // Create Circle objects for inner and outer circles
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute the area of the shaded region
        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        // Display the results
        System.out.println("\nResults:");
        System.out.printf("Inner Circle Area: %.2f%n", innerCircle.computeArea());
        System.out.printf("Outer Circle Area: %.2f%n", outerCircle.computeArea());
        System.out.printf("Shaded Region Area: %.2f%n", shadedArea);

        scanner.close();
    }
}
