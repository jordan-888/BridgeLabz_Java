
package coreprogramming.strings.level3;
import java.util.Scanner;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        // Create frequency array for ASCII characters
        int[] frequency = new int[256];

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Find first character with frequency = 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char result = findFirstNonRepeating(str);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        input.close();
    }
}
