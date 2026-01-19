
package objectorientedprogramming.inheritance.level1;
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
        System.out.println("------------------------");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("------------------------");
    }
}

class Intern extends Employee {
    int duration; // in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Duration: " + duration + " months");
        System.out.println("------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===\n");

        // Create employee objects
        Manager manager = new Manager("Alice Johnson", 101, 90000, 10);
        Developer developer = new Developer("Bob Smith", 102, 75000, "Java");
        Intern intern = new Intern("Charlie Brown", 103, 30000, 6);

        // Display details
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
