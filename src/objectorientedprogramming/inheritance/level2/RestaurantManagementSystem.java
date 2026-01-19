
package objectorientedprogramming.inheritance.level2;
// Hybrid Inheritance using Interface
class Person {
    String name;
    String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("=== Chef ===");
        displayPersonInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals, managing kitchen");
        System.out.println("------------------------");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    public Waiter(String name, String id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("=== Waiter ===");
        displayPersonInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving customers, taking orders");
        System.out.println("------------------------");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Restaurant Management System (Hybrid Inheritance) ===\n");

        // Create restaurant workers
        Chef chef = new Chef("Gordon Ramsay", "CH001", "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", "WT001", 5);

        // Perform duties
        chef.performDuties();
        waiter.performDuties();

        // Demonstrate polymorphism with interface
        System.out.println("=== Workers Performing Duties ===");
        Worker[] workers = { chef, waiter };
        for (Worker worker : workers) {
            worker.performDuties();
        }
    }
}
