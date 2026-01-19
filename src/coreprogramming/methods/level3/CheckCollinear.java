
package coreprogramming.methods.level3;
import java.util.Scanner;

public class CheckCollinear {
    public static boolean UseSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((y2 - y1) / (x2 - x1) == (y3 - y2) / (x3 - x2) && (y3 - y2) / (x3 - x2) == (y1 - y3) / (x1 - x3)) {
            return true;
        }
        return false;
    }

    public static boolean UseArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = (int) (0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        if (area == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the three points:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        System.out.println(UseSlope(x1, y1, x2, y2, x3, y3));
        System.out.println(UseArea(x1, y1, x2, y2, x3, y3));
        input.close();
    }
}