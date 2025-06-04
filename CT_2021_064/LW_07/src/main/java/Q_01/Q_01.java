package Q_01;
import javax.swing.*;

public class Q_01 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third integer:"));

        int sum = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }
}
