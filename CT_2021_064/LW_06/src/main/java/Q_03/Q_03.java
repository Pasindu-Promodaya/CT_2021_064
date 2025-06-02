package Q_03;
import java.util.ArrayList;
import java.util.Scanner;

// Base class Pet
class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        this.name = petName;
    }

    public String getType() {
        return "Pet";
    }
}

// Cat subclass
class Cat extends Pet {
    @Override
    public String getType() {
        return "Cat";
    }
}

// Dog subclass
class Dog extends Pet {
    @Override
    public String getType() {
        return "Dog";
    }
}

public class Q_03 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter pet name (or STOP to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for Cat, d for Dog): ");
            String type = scanner.nextLine().trim().toLowerCase();

            Pet pet;
            if (type.equals("c")) {
                pet = new Cat();
            } else if (type.equals("d")) {
                pet = new Dog();
            } else {
                System.out.println("Invalid type. Please enter 'c' or 'd'.");
                continue;
            }

            pet.setName(name);
            pets.add(pet);
        }

        // Group and display pets
        System.out.println("\nCat Names:");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                System.out.println("- " + p.getName());
            }
        }

        System.out.println("\nDog Names:");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                System.out.println("- " + p.getName());
            }
        }

        scanner.close();
    }
}
