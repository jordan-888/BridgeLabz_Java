
package coreprogramming.methods.level3;
import java.util.Scanner;

public class NumberChecker3 extends NumberChecker {
    public static int[] reversedDigits(int n) {
        int[] digits = storeDigits(n);
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - i - 1];
        }
        return reversed;
    }

    public static boolean arrayEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = storeDigits(n);
        int[] reversed = reversedDigits(n);
        return arrayEqual(digits, reversed);
    }

    public static boolean duckNumber(int n) {
        int[] digits = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                continue;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Is palindrome: " + isPalindrome(n));
        System.out.println("Is duck number: " + duckNumber(n));
        input.close();
    }
}