package objectorientedprogramming.encapsulationpolymorphisminterfaceabstractclass.level1;

// Department interface
interface Department {
    void assignDepartment(String dept);

    String getDepartmentDetails();
}

// Abstract Employee class implementing Department interface
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Department interface implementation
    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department != null ? department : "Not Assigned";
    }

    // Abstract method - must be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.printf("Employee ID: %d\n", employeeId);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Base Salary: $%.2f\n", baseSalary);
        System.out.printf("Department: %s\n", getDepartmentDetails());
        System.out.printf("Calculated Salary: $%.2f\n", calculateSalary());
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Full-Time Employee ===");
        super.displayDetails();
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getters and Setters for additional fields
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Based on hours worked
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Part-Time Employee ===");
        super.displayDetails();
        System.out.printf("Hours Worked: %d\n", hoursWorked);
        System.out.printf("Hourly Rate: $%.2f\n", hourlyRate);
    }
}

// Main class demonstrating polymorphism
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("========== Employee Management System ==========\n");

        // Create array of Employee references (Polymorphism)
        Employee[] employees = new Employee[3];

        // Instantiate different employee types
        employees[0] = new FullTimeEmployee(101, "Alice Johnson", 5000);
        employees[1] = new PartTimeEmployee(102, "Bob Smith", 0, 80, 25);
        employees[2] = new FullTimeEmployee(103, "Charlie Brown", 6000);

        // Assign departments
        employees[0].assignDepartment("Engineering");
        employees[1].assignDepartment("Marketing");
        employees[2].assignDepartment("HR");

        // Process all employees polymorphically
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------------------------------");
        }

        // Demonstrate encapsulation - using getters/setters
        System.out.println("\n=== Updating Employee Information ===");
        employees[0].setBaseSalary(5500);
        System.out.println("Updated " + employees[0].getName() + "'s salary to: $" + employees[0].getBaseSalary());
    }
}