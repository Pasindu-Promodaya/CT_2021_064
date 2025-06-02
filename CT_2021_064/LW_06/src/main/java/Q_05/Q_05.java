package Q_05;

import Q_04.Dog;
import Q_04.Cat;
import Q_04.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Input section (reused from Q_04)
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
                    dogList.add(dog); // ✅ add only Dog references here
                } catch (NumberFormatException e) {
                    System.out.println("Invalid weight. Skipping dog entry.");
                }
            } else {
                System.out.println("Invalid type. Please enter 'c' or 'd'.");
            }
        }

        //Process only Dog list
        if (dogList.isEmpty()) {
            System.out.println("\nNo dogs in the list.");
        } else {
            double total = 0;
            double min = dogList.get(0).getWeight();
            double max = min;

            for (Dog d : dogList) {
                double w = d.getWeight();
                total += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            double avg = total / dogList.size();

            System.out.println("\nDog Weight Statistics:");
            System.out.printf("Average: %.2f kg%n", avg);
            System.out.printf("Minimum: %.2f kg%n", min);
            System.out.printf("Maximum: %.2f kg%n", max);
        }

        scanner.close();
    }
}
