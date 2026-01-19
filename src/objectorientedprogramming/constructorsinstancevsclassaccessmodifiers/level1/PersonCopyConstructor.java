
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level1;
class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }
}

public class PersonCopyConstructor {
    public static void main(String[] args) {
        // Create original person object
        Person original = new Person("John Doe", 30);

        System.out.println("Original Person:");
        original.displayDetails();

        // Create copied person object using copy constructor
        Person copied = new Person(original);

        System.out.println("Copied Person:");
        copied.displayDetails();

        // Modify copied object to show they are independent
        copied.name = "Jane Doe";
        copied.age = 25;

        System.out.println("After modifying copied object:");
        System.out.println("\nOriginal Person:");
        original.displayDetails();

        System.out.println("Copied Person:");
        copied.displayDetails();
    }
}
