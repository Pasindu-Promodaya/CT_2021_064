package Q_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter pet name (or STOP to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for Cat, d for Dog): ");
            String type = scanner.nextLine().trim().toLowerCase();

            if (type.equals("c")) {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(scanner.nextLine());
                pets.add(cat);

            } else if (type.equals("d")) {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                try {
                    dog.setWeight(Double.parseDouble(scanner.nextLine()));
                    pets.add(dog);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid weight entered. Skipping this dog.");
                }

            } else {
                System.out.println("Invalid type. Please enter 'c' or 'd'.");
            }
        }

        // Display cats
        System.out.println("\nCat List:");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                Cat cat = (Cat) p;
                System.out.println("Name: " + cat.getName() + ", Type: Cat, Coat Color: " + cat.getCoatColor());
            }
        }

        // Display dogs
        System.out.println("\nDog List:");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                Dog dog = (Dog) p;
                System.out.println("Name: " + dog.getName() + ", Type: Dog, Weight: " + dog.getWeight() + " kg");
            }
        }

        scanner.close();
    }
}


