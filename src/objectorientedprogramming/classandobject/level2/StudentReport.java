
package objectorientedprogramming.classandobject.level2;
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("------------------------");
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Alice Johnson", 101, 92.5);
        Student student2 = new Student("Bob Smith", 102, 78.0);
        Student student3 = new Student("Charlie Brown", 103, 65.5);
        Student student4 = new Student("Diana Prince", 104, 45.0);

        // Display student details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}
