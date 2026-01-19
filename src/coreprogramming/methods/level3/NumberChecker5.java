
package coreprogramming.methods.level3;
import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker5 extends NumberChecker {
    public static int[] findFactors(int n) {
        // First loop: count factors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Second loop: store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int n) {
        int[] factors = findFactors(n);
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int n) {
        int[] factors = findFactors(n);
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static long productOfFactors(int n) {
        int[] factors = findFactors(n);
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double productOfCubesOfFactors(int n) {
        int[] factors = findFactors(n);
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static boolean isPerfect(int n) {
        int[] factors = findFactors(n);
        int sum = 0;
        // Sum proper divisors (exclude the number itself)
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int[] factors = findFactors(n);
        int sum = 0;
        // Sum proper divisors (exclude the number itself)
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int[] factors = findFactors(n);
        int sum = 0;
        // Sum proper divisors (exclude the number itself)
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < n;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrong(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += factorial(digits[i]);
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factors: " + Arrays.toString(findFactors(n)));
        System.out.println("Greatest factor: " + greatestFactor(n));
        System.out.println("Sum of factors: " + sumOfFactors(n));
        System.out.println("Product of factors: " + productOfFactors(n));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(n));
        System.out.println("Is perfect number: " + isPerfect(n));
        System.out.println("Is abundant number: " + isAbundant(n));
        System.out.println("Is deficient number: " + isDeficient(n));
        System.out.println("Is strong number: " + isStrong(n));
        input.close();
    }
}
