
package coreprogramming.methods.level3;
import java.util.Scanner;

public class EuclideanDistance {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];

        // Calculate slope (m)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b) using y = mx + b => b = y - mx
        double b = y1 - m * x1;

        equation[0] = m; // slope
        equation[1] = b; // y-intercept

        return equation;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for first point:");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for second point:");
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean distance: " + distance);

        if (x1 != x2) { // Check if line is not vertical
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("\nLine equation: y = " + equation[0] + "x + " + equation[1]);
            System.out.println("Slope (m): " + equation[0]);
            System.out.println("Y-intercept (b): " + equation[1]);
        } else {
            System.out.println("\nLine equation: x = " + x1 + " (vertical line)");
        }

        input.close();
    }
}
