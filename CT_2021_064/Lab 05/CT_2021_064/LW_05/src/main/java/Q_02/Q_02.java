package Q_02;
import java.util.Scanner;

public class Q_02 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter an integer (negative to stop): ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.println("Number of digits: " + countDigits(number));
            }
        } while (number >= 0);
    }
}


