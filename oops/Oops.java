package oops;

// Parent class
class Parent {
    int id;
    String name;

    public Parent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Child class
class Child extends Parent {
    String role;

    public Child(int id, String name, String role) {
        super(id, name); // Call the constructor of the Parent class
        this.role = role;
    }

    public void displayRole() {
        System.out.println("Role: " + role);
    }
}

// Main class
public class Oops {
    public static void main(String[] args) {
        System.out.println("Checking value:");

        // Create an object of the Child class
        Child child = new Child(101, "Siddiq", "Software Developer");

        // Access methods from both the Parent and Child classes
        child.displayDetails(); // Method from Parent class
        child.displayRole();    // Method from Child class
    }
}
