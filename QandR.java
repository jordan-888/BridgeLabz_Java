import java.util.Scanner;

public class QandR {
    public double[] calculateQandR(int a, int b) {
        double q = a/b;
        double r = a%b;
        return new double[]{q, r};
    }

    public static void main(String args[]){
        QandR obj = new QandR();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double[] res = obj.calculateQandR(a, b);
        System.out.printf("Quotient: %.2f%n Remainder: %.2f%n", res[0], res[1]);
        sc.close();
    }
}