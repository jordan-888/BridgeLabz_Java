
package coreprogramming.strings.level3;
import java.util.Scanner;

public class PalindromeChecker {
    // Logic 1: Iterative Comparison
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive Method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case
        if (start >= end) {
            return true;
        }

        // Check current characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Reverse and Compare
    public static boolean isPalindromeReverse(String str) {
        // Reverse string using charAt()
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Convert to char arrays
        char[] original = str.toCharArray();
        char[] reversedArray = reversed.toCharArray();

        // Compare arrays
        if (original.length != reversedArray.length) {
            return false;
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversedArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("\n=== Palindrome Check Results ===");
        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Reverse & Compare): " + isPalindromeReverse(text));

        input.close();
    }
}
