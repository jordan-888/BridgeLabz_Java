
package objectorientedprogramming.objectmodellingclassdiagram.level1;
import java.util.ArrayList;

class Employee {
    String name;
    String employeeId;
    String designation;

    public Employee(String name, String employeeId, String designation) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("  Employee: " + name + " (" + employeeId + ") - " + designation);
    }
}

class Department {
    String departmentName;
    ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String employeeId, String designation) {
        Employee emp = new Employee(name, employeeId, designation);
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + departmentName);
        System.out.println("Employees:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public Department createDepartment(String departmentName) {
        Department dept = new Department(departmentName);
        departments.add(dept);
        return dept;
    }

    public void displayCompany() {
        System.out.println("\n=== Company: " + companyName + " ===");
        System.out.println("Total Departments: " + departments.size());
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    // When company is deleted, all departments and employees are removed
    // (Composition)
    public void closeCompany() {
        System.out.println("\nClosing " + companyName + "...");
        departments.clear();
        System.out.println("All departments and employees removed (Composition)");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        System.out.println("=== Company and Departments (Composition) ===\n");

        // Create Company
        Company company = new Company("Tech Solutions Inc.");

        // Create Departments (Composition - departments belong to company)
        Department itDept = company.createDepartment("IT Department");
        Department hrDept = company.createDepartment("HR Department");
        Department salesDept = company.createDepartment("Sales Department");

        // Add Employees to Departments (Composition - employees belong to departments)
        itDept.addEmployee("Alice Johnson", "E001", "Software Engineer");
        itDept.addEmployee("Bob Smith", "E002", "System Admin");

        hrDept.addEmployee("Charlie Brown", "E003", "HR Manager");
        hrDept.addEmployee("Diana Prince", "E004", "Recruiter");

        salesDept.addEmployee("Eve Wilson", "E005", "Sales Manager");
        salesDept.addEmployee("Frank Miller", "E006", "Sales Executive");

        // Display company structure
        company.displayCompany();

        // Demonstrate composition - closing company removes all departments and
        // employees
        company.closeCompany();

        System.out.println("\nAfter closing company:");
        System.out.println("Departments remaining: " + company.departments.size());
    }
}
