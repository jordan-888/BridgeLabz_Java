
package objectorientedprogramming.thisstaticfinalinstanceof.level1;
class Student {
    // Static variable
    static String universityName = "State University";
    static int totalStudents = 0;

    // Instance variables
    String name;
    final int rollNumber; // final - cannot be modified
    String grade;

    // Constructor using 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("University Name: " + universityName);
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        System.out.println("=== University Student Management ===\n");

        // Create student objects
        Student student1 = new Student("Emma Wilson", 1001, "A");
        Student student2 = new Student("Liam Brown", 1002, "B+");
        Student student3 = new Student("Olivia Davis", 1003, "A-");

        // Check object type before displaying
        Object obj = student1;
        if (obj instanceof Student) {
            System.out.println("Object is a valid Student");
            ((Student) obj).displayDetails();
        }

        student2.displayDetails();
        student3.displayDetails();

        // Update student data after instanceof check
        System.out.println("\nUpdating student grade:");
        if (student2 instanceof Student) {
            student2.updateGrade("A");
            student2.displayDetails();
        }

        // Display total students
        System.out.println();
        Student.displayTotalStudents();
    }
}
