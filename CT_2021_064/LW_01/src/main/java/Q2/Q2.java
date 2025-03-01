package Q2;
import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        JFrame frame = new JFrame();
        frame.setSize(250, 150);
        frame.setTitle(firstName+" "+lastName);
        frame.setVisible(true);

    }
}
