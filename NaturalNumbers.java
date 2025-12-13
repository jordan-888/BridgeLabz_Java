import java.util.Scanner;

public class NaturalNumbers {
    public int sum(int n){
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]){
        NaturalNumbers obj = new NaturalNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + obj.sum(n));
        sc.close();
    }
}