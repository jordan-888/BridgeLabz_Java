package JavaCollectionsStreams.generics;

import java.util.ArrayList;
import java.util.List;

// Abstract class for different course types
abstract class CourseType {
    protected String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public abstract void evaluate();

    public String getEvaluationType() {
        return evaluationType;
    }
}

// Concrete course type implementations
class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation: Written examination with MCQs and descriptive questions");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation: Project submissions and practical assignments");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation: Research paper, thesis, and presentation");
    }
}

// Generic Course class with bounded type parameter
class Course<T extends CourseType> {
    private String courseCode;
    private String courseName;
    private String department;
    private T evaluationType;
    private int credits;

    public Course(String courseCode, String courseName, String department, T evaluationType, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.department = department;
        this.evaluationType = evaluationType;
        this.credits = credits;
    }

    public void displayCourseInfo() {
        System.out.println("\nCourse Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Department: " + department);
        System.out.println("Credits: " + credits);
        System.out.println("Evaluation Type: " + evaluationType.getEvaluationType());
        evaluationType.evaluate();
    }

    public T getEvaluationType() {
        return evaluationType;
    }
}

// Course Management System
class CourseManagementSystem {
    private List<Course<? extends CourseType>> allCourses = new ArrayList<>();

    // Generic method to add course
    public <T extends CourseType> void addCourse(Course<T> course) {
        allCourses.add(course);
        System.out.println("✓ Course added successfully!");
    }

    // Wildcard method to display all courses
    public void displayAllCourses(List<? extends Course<? extends CourseType>> courses) {
        System.out.println("\n========================================");
        System.out.println("         ALL REGISTERED COURSES         ");
        System.out.println("========================================");
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseInfo();
        }
    }

    // Method to display courses by evaluation type using wildcards
    public static void displayCoursesByType(List<? extends CourseType> evaluationTypes) {
        System.out.println("\n--- Evaluation Methods Used ---");
        for (CourseType type : evaluationTypes) {
            System.out.println("• " + type.getEvaluationType());
        }
    }

    public List<Course<? extends CourseType>> getAllCourses() {
        return allCourses;
    }
}

public class UniversityCourseManagement {
    public static void main(String[] args) {
        System.out.println("=== Multi-Level University Course Management System ===\n");

        CourseManagementSystem cms = new CourseManagementSystem();

        // Creating courses with different evaluation types
        Course<ExamCourse> course1 = new Course<>("CS101", "Data Structures",
                "Computer Science", new ExamCourse(), 4);

        Course<AssignmentCourse> course2 = new Course<>("CS201", "Web Development",
                "Computer Science", new AssignmentCourse(), 3);

        Course<ResearchCourse> course3 = new Course<>("CS301", "Machine Learning Research",
                "Computer Science", new ResearchCourse(), 6);

        Course<ExamCourse> course4 = new Course<>("MATH101", "Calculus",
                "Mathematics", new ExamCourse(), 4);

        Course<AssignmentCourse> course5 = new Course<>("ENG201", "Technical Writing",
                "English", new AssignmentCourse(), 2);

        // Adding courses
        System.out.println("--- Adding Courses ---");
        cms.addCourse(course1);
        cms.addCourse(course2);
        cms.addCourse(course3);
        cms.addCourse(course4);
        cms.addCourse(course5);

        // Display all courses using wildcard
        cms.displayAllCourses(cms.getAllCourses());

        // Demonstrating wildcard with evaluation types
        List<CourseType> evaluationTypes = new ArrayList<>();
        evaluationTypes.add(new ExamCourse());
        evaluationTypes.add(new AssignmentCourse());
        evaluationTypes.add(new ResearchCourse());

        CourseManagementSystem.displayCoursesByType(evaluationTypes);

        System.out.println("\n--- Type Safety Benefits ---");
        System.out.println("✓ Bounded type parameters ensure only valid CourseType subclasses");
        System.out.println("✓ Wildcards allow flexible handling of different course types");
        System.out.println("✓ Compile-time type checking prevents invalid course assignments");
    }
}
