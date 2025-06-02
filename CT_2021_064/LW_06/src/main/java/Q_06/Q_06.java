package Q_06;

import Q_04.Cat;
import Q_04.Dog;
import Q_04.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        ArrayList<Cat> catList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        do {
            //Display Menu
            System.out.println("\n--- Pet Management Menu ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("5. Display All Pets");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    Cat cat = new Cat();
                    System.out.print("Enter cat name: ");
                    String name = scanner.nextLine();
                    cat.setName(name);
                    System.out.print("Enter coat color: ");
                    String coatColor = scanner.nextLine();
                    cat.setCoatColor(coatColor);

                    catList.add(cat);
                    pets.add(cat);
                    System.out.println("Cat added successfully.");
                }

                case 2 -> {
                    Dog dog = new Dog();
                    System.out.print("Enter dog name: ");
                    String name = scanner.nextLine();
                    dog.setName(name);
                    System.out.print("Enter weight: ");
                    try {
                        double weight = Double.parseDouble(scanner.nextLine());
                        dog.setWeight(weight);
                        dogList.add(dog);
                        pets.add(dog);
                        System.out.println("Dog added successfully.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid weight. Dog not added.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter cat name to remove: ");
                    String name = scanner.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < catList.size(); i++) {
                        if (catList.get(i).getName().equalsIgnoreCase(name)) {
                            catList.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    pets.removeIf(p -> p instanceof Cat && p.getName().equalsIgnoreCase(name));

                    if (removed) System.out.println("Cat removed successfully.");
                    else System.out.println("Cat not found.");
                }

                case 4 -> {
                    System.out.print("Enter dog name to remove: ");
                    String name = scanner.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < dogList.size(); i++) {
                        if (dogList.get(i).getName().equalsIgnoreCase(name)) {
                            dogList.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    pets.removeIf(p -> p instanceof Dog && p.getName().equalsIgnoreCase(name));

                    if (removed) System.out.println("Dog removed successfully.");
                    else System.out.println("Dog not found.");
                }

                case 5 -> {
                    if (pets.isEmpty()) {
                        System.out.println("No pets available.");
                    } else {
                        System.out.println("\n--- All Pets ---");
                        for (Pet p : pets) {
                            if (p instanceof Cat cat) {
                                System.out.println("Cat - Name: " + cat.getName() + ", Coat Color: " + cat.getCoatColor());
                            } else if (p instanceof Dog dog) {
                                System.out.println("Dog - Name: " + dog.getName() + ", Weight: " + dog.getWeight() + " kg");
                            }
                        }
                    }
                }

                case 0 -> System.out.println("Exiting program. Goodbye!");

                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
