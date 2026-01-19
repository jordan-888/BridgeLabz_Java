
package objectorientedprogramming.constructorsinstancevsclassaccessmodifiers.level1;
class Circle {
    double radius;

    // Default constructor with constructor chaining
    public Circle() {
        this(5.0); // Calls parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", calculateCircumference()));
        System.out.println("------------------------");
    }
}

public class CircleConstructorChaining {
    public static void main(String[] args) {
        // Using default constructor (constructor chaining)
        Circle circle1 = new Circle();
        System.out.println("Circle created with default constructor:");
        circle1.displayDetails();

        // Using parameterized constructor
        Circle circle2 = new Circle(10.0);
        Circle circle3 = new Circle(7.5);

        System.out.println("Circles created with parameterized constructor:");
        circle2.displayDetails();
        circle3.displayDetails();
    }
}
