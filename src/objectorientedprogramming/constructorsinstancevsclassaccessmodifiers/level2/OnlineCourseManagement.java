
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level2;
class Course {
    // Instance variables
    String courseName;
    int duration; // in hours
    double fee;

    // Class variable (static)
    static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
        System.out.println("========================");
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        System.out.println("=== Online Course Management ===\n");

        // Create course objects
        Course course1 = new Course("Java Programming", 40, 299.99);
        Course course2 = new Course("Python for Data Science", 35, 249.99);
        Course course3 = new Course("Web Development", 50, 349.99);

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Update institute name using class method
        System.out.println();
        Course.updateInstituteName("Advanced Tech Institute");

        // Display course details again to show updated institute name
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
