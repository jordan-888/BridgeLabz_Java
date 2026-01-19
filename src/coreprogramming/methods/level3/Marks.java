
package coreprogramming.methods.level3;
import java.util.Scanner;

public class Marks {
    public static int[][] calcMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int) (Math.random() * 90) + 10;
            marks[i][1] = (int) (Math.random() * 90) + 10;
            marks[i][2] = (int) (Math.random() * 90) + 10;
        }
        return marks;
    }

    public static double[][] calcPercent(int n, int[][] marks) {
        double[][] percent = new double[n][3];
        for (int i = 0; i < n; i++) {
            percent[i][0] = marks[i][0] + marks[i][1] + marks[i][2]; // total marks
            percent[i][1] = Math.round((percent[i][0] / 3) * 100) / 100; // average marks
            percent[i][2] = percent[i][1]; // percentage
        }
        return percent;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        int[][] marks = calcMarks(n);
        double[][] percent = calcPercent(n, marks);
        for (int i = 0; i < n; i++) {
            System.out.printf(
                    "Scores:\t\t\t\tTotal marks\tAverage marks\tPercentage\nPhysics\tChemistry\tMath\n%6d\t%9d\t%4d\t%11.2f\t%13.2f\t%10.2f\n",
                    marks[i][0], marks[i][1], marks[i][2], percent[i][0], percent[i][1], percent[i][2]);
        }
        input.close();
    }
}