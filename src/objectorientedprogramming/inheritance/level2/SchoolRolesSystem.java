
package objectorientedprogramming.inheritance.level2;
// Hierarchical Inheritance: Person → Teacher, Student, Staff
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: Person");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("=== Teacher ===");
        displayPersonInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
        System.out.println("------------------------");
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("=== Student ===");
        displayPersonInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}

class Staff extends Person {
    String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void displayRole() {
        System.out.println("=== Staff ===");
        displayPersonInfo();
        System.out.println("Role: " + role);
        System.out.println("------------------------");
    }
}

public class SchoolRolesSystem {
    public static void main(String[] args) {
        System.out.println("=== School Roles System (Hierarchical Inheritance) ===\n");

        // Create different school roles
        Teacher teacher = new Teacher("Dr. Alice Johnson", 45, "Mathematics");
        Student student = new Student("Bob Smith", 16, "Grade 10");
        Staff staff = new Staff("Charlie Brown", 35, "Librarian");

        // Display roles
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
