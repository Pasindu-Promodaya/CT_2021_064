package Q11;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        System.out.println("Enter middle name: ");
        String middleName = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        String formattedName = lastName+", "+firstName+" "+middleName.charAt(0)+".";
        System.out.println(formattedName);
    }
}
