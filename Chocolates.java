import java.util.Scanner;

public class Chocolates {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] {remainder, quotient};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and students: ");
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] res = Chocolates.findRemainderAndQuotient(number, divisor);
        System.out.printf("Remainder: %d, Each student gets: %d%n", res[0], res[1]);
        sc.close();
    }
}