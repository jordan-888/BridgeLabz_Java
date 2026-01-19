
package coreprogramming.strings.level3;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequencies for first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch]++;
        }

        // Count frequencies for second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq2[ch]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = input.nextLine();
        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("The texts are anagrams!");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        input.close();
    }
}
