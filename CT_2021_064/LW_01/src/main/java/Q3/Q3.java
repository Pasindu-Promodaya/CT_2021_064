package Q3;

import javax.swing.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        System.out.println("Enter middle name: ");
        String middleName = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        String initial = middleName.substring(0,1);
        System.out.println(firstName+" "+initial+". "+lastName);
    }
}
