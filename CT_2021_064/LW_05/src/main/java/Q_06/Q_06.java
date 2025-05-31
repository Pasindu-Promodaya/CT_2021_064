package Q_06;
import java.util.Scanner;
import java.util.Random;

public class Q_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! Well done!");
            }
        } while (guess != numberToGuess);
    }
}
