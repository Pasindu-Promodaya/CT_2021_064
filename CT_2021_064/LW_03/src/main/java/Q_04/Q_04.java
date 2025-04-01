package Q_04;
// Owner class to store owner details
class Owner {
    private String ownerName;
    private String phoneNo;

    // Default constructor
    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "Not Available";
    }

    // Parameterized constructor
    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    // Getter and setter methods
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}

// Modified Bicycle class
class Bicycle {
    // Data Member: Instead of separate fields, we use an Owner object
    private Owner owner;

    // Default Constructor
    public Bicycle() {
        this.owner = new Owner(); // Assigns default owner
    }

    // Parameterized Constructor
    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    // Getters and Setters for owner details
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }

    // Method to get Owner object
    public Owner getOwner() {
        return owner;
    }

    // Method to set Owner object
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class Q_04 {
    public static void main(String[] args) {
// Creating a Bicycle with default owner
        Bicycle bike1 = new Bicycle();
        System.out.println("Bike 1 Owner: " + bike1.getOwnerName());
        System.out.println("Bike 1 Phone: " + bike1.getPhoneNo());

        // Creating a Bicycle with a specific owner
        Bicycle bike2 = new Bicycle("Alice", "123-456-7890");
        System.out.println("\nBike 2 Owner: " + bike2.getOwnerName());
        System.out.println("Bike 2 Phone: " + bike2.getPhoneNo());

        // Changing the owner details using the setter methods
        bike2.setOwnerName("Bob");
        bike2.setPhoneNo("987-654-3210");
        System.out.println("\nAfter Updating Bike 2 Owner:");
        System.out.println("Bike 2 Owner: " + bike2.getOwnerName());
        System.out.println("Bike 2 Phone: " + bike2.getPhoneNo());
    }
}
