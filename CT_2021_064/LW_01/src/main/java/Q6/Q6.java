package Q6;
import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the window: ");
        int width = scanner.nextInt();

        System.out.println("Enter the height of the window: ");
        int height = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the Title of the window: ");
        String title  = scanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
