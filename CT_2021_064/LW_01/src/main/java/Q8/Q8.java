package Q8;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String with an Exclamation(!) mark: ");
        String input = scanner.nextLine();

        String[] parts = input.split("!");

        System.out.println(parts[0].trim());
        System.out.println(parts[1].trim());
    }
}
