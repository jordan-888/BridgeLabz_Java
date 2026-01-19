
package coreprogramming.strings.level3;
import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] findFrequency(String str) {
        char[] chars = str.toCharArray();
        String[] result = new String[chars.length];
        int resultIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue; // Skip already counted characters
            }

            int frequency = 1;

            // Count duplicates in remaining string
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency++;
                    chars[j] = '0'; // Mark as counted
                }
            }

            result[resultIndex++] = chars[i] + ":" + frequency;
        }

        // Create final array with only valid entries
        String[] finalResult = new String[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] frequencies = findFrequency(str);

        System.out.println("\nCharacter Frequencies:");
        System.out.println("========================");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i]);
        }

        input.close();
    }
}
