package Q_06;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current year
        int currentYear = java.time.Year.now().getValue();

        // Prompt user for input
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate age
        int age = currentYear - birthYear;

        // Output result
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

        scanner.close();
    }
}

