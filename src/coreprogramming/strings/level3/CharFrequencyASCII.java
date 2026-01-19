
package coreprogramming.strings.level3;
import java.util.Scanner;

public class CharFrequencyASCII {
    public static String[][] findFrequency(String str) {
        // Create frequency array for ASCII characters
        int[] frequency = new int[256];

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array with character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[][] frequencies = findFrequency(str);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("========================");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
        }

        input.close();
    }
}
