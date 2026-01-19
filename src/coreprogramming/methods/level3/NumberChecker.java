
package coreprogramming.methods.level3;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class NumberChecker {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int[] digits = new int[countDigits(n)];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean duckNumber(int n) {
        int[] digits = storeDigits(n);
        // Duck number: contains 0 but first digit is not 0
        // Check if first digit (last in array since we store reversed) is 0
        if (digits[digits.length - 1] == 0)
            return false;

        // Check if any digit is 0
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean armstrong(int n) {
        int[] digits = storeDigits(n);
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], digits.length);
        }
        if (sum == n)
            return true;
        return false;
    }

    public static int[] twoLargest(int n) {
        int[] largest = new int[2];
        largest[0] = Integer.MIN_VALUE;
        largest[1] = Integer.MIN_VALUE;
        int[] digits = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest[0]) {
                largest[1] = largest[0];
                largest[0] = digits[i];
            } else if (digits[i] > largest[1])
                largest[1] = digits[i];
        }
        return largest;
    }

    public static int[] twoSmallest(int n) {
        int[] smallest = new int[2];
        smallest[0] = Integer.MAX_VALUE;
        smallest[1] = Integer.MAX_VALUE;
        int[] digits = storeDigits(n);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest[0]) {
                smallest[1] = smallest[0];
                smallest[0] = digits[i];
            } else if (digits[i] < smallest[1])
                smallest[1] = digits[i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The number of digits is: " + countDigits(n));
        System.out.println("The digits are: " + Arrays.toString(storeDigits(n)));
        System.out.println("The number is a duck number: " + duckNumber(n));
        System.out.println("Is armstrong number: " + armstrong(n));
        System.out.println("The two largest digits are: " + Arrays.toString(twoLargest(n)));
        System.out.println("The two smallest digits are: " + Arrays.toString(twoSmallest(n)));
        input.close();
    }
}