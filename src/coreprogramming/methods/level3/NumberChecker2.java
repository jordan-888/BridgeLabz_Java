
package coreprogramming.methods.level3;
import java.util.Scanner;
import java.lang.Math;

public class NumberChecker2 extends NumberChecker {
    public static int digitsSum(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double squareSum(int n) {
        int[] digits = storeDigits(n);
        double square = 0;
        for (int i = 0; i < digits.length; i++) {
            square += Math.pow(digits[i], 2);
        }
        return square;
    }

    public static boolean harshadNumber(int n) {
        return n % digitsSum(n) == 0;
    }

    public static int[][] frequency(int n) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int digit : storeDigits(n)) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.printf("Sum of digits: %d%n", digitsSum(n));
        System.out.printf("Square sum: %.2f%n", squareSum(n));
        System.out.printf("Harshad number: %b%n", harshadNumber(n));
        System.out.printf("Frequency:%n");
        int[][] freq = frequency(n);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.printf("  Digit %d: frequency: %d%n", freq[i][0], freq[i][1]);
            }
        }
        input.close();
    }
}