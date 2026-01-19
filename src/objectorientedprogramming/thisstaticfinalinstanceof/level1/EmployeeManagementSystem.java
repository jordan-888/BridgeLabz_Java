
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Employee {
    // Static variable
    static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;

    // Instance variables
    String name;
    final int id; // final - cannot be modified
    String designation;

    // Constructor using 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===\n");

        // Create employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");
        Employee emp3 = new Employee("Charlie Brown", 103, "Data Analyst");

        // Using instanceof to check object type before printing
        Object obj = emp1;
        if (obj instanceof Employee) {
            System.out.println("Object belongs to Employee class");
            ((Employee) obj).displayDetails();
        }

        emp2.displayDetails();
        emp3.displayDetails();

        // Display total employees using static method
        Employee.displayTotalEmployees();
    }
}
