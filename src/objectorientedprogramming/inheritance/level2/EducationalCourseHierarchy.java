
package objectorientedprogramming.inheritance.level2;
// Multilevel Inheritance: Course → OnlineCourse → PaidOnlineCourse
class Course {
    String courseName;
    int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform,
            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee * (1 - discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Original Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + String.format("%.2f", calculateFinalFee()));
        System.out.println("------------------------");
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        System.out.println("=== Educational Course Hierarchy (Multilevel Inheritance) ===\n");

        // Create courses at different levels
        Course course1 = new Course("Introduction to Programming", 20);
        OnlineCourse course2 = new OnlineCourse("Web Development", 40, "Udemy", true);
        PaidOnlineCourse course3 = new PaidOnlineCourse("Advanced Java", 60, "Coursera", true, 299.99, 20);

        // Display course information
        System.out.println("=== Basic Course ===");
        course1.displayCourseInfo();
        System.out.println();

        System.out.println("=== Online Course ===");
        course2.displayCourseInfo();
        System.out.println();

        System.out.println("=== Paid Online Course ===");
        course3.displayCourseInfo();
    }
}
