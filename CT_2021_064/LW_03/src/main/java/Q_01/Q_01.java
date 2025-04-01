package Q_01;
import java.util.Scanner;

// Define the Temperature class
class Temperature {
    private double celsius;

    // No-Arg Constructor
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Method to get temperature in Celsius
    public double toCelsius() {
        return celsius;
    }

    // Method to set temperature in Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Method to set temperature in Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

// Main class to test the Temperature class
public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        // Create an instance of Temperature class
        Temperature temp = new Temperature(celsiusInput);

        // Convert and display the temperature in Fahrenheit
        System.out.println("Equivalent temperature in Fahrenheit: " + temp.toFahrenheit());

        scanner.close();
    }
}
