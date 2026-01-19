
package coreprogramming.methods.level3;
import java.util.Scanner;

public class NumberChecker4 extends NumberChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int[] digits = storeDigits(square);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
            product *= digits[i];
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Is prime: " + isPrime(n));
        System.out.println("Is neon number: " + isNeon(n));
        System.out.println("Is spy number: " + isSpy(n));
        System.out.println("Is automorphic number: " + isAutomorphic(n));
        System.out.println("Is buzz number: " + isBuzz(n));
        input.close();
    }
}
