package Q_01;
import java.util.Scanner;

public class Q_01a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double B, A, C, X, Y, radius;
        System.out.println("Enter values for B, A, C, X, and Y:");
        B = scanner.nextDouble();
        A = scanner.nextDouble();
        C = scanner.nextDouble();
        X = scanner.nextDouble();
        Y = scanner.nextDouble();

        //Part a)
        System.out.println("a) Square root of B² + 4AC: " + Math.sqrt((B * B) + (4 * A * C)));

        //Part b)
        System.out.println("b) Square root of X + 4Y³: " + Math.sqrt(X + (4 * Math.pow(Y, 3))));

        //Part c)
        System.out.println("c) Cube root of product of X and Y: " + Math.cbrt(X * Y));

        //Part d)
        System.out.println("d) Enter radius of circle:");
        radius = scanner.nextDouble();
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}
