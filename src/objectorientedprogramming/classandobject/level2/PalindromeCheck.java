
package objectorientedprogramming.classandobject.level2;
class PalindromeChecker {
    String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: '" + text + "' is a palindrome!");
        } else {
            System.out.println("Result: '" + text + "' is NOT a palindrome.");
        }
        System.out.println("------------------------");
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create palindrome checker objects
        PalindromeChecker checker1 = new PalindromeChecker("radar");
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        PalindromeChecker checker3 = new PalindromeChecker("madam");
        PalindromeChecker checker4 = new PalindromeChecker("racecar");
        PalindromeChecker checker5 = new PalindromeChecker("java");

        // Display results
        checker1.displayResult();
        checker2.displayResult();
        checker3.displayResult();
        checker4.displayResult();
        checker5.displayResult();
    }
}
