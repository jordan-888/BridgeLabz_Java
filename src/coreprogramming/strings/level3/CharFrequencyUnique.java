
package coreprogramming.strings.level3;
import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] findUniqueChars(String str) {
        char[] temp = new char[str.length()];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static String[][] findFrequency(String str) {
        char[] uniqueChars = findUniqueChars(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // Count frequency using ASCII logic
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(count);
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
