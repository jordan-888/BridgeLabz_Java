import java.util.Scanner;
import java.lang.Math;

public class Quadratic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double Delta = b*b - 4*a*c;

        double root1, root2;

        root1 = (-b + Math.sqrt(Delta)) / (2*a);
        root2 = (-b - Math.sqrt(Delta)) / (2*a);

        System.out.printf("Roots are: %.2f and %.2f%n", root1, root2);
        sc.close();
        
    }
}