import java.util.Scanner;

public class CheckPositiveNegative {
    public int CheckNumber(int n){
        if(n>0) return 1;
        else if (n<0) return -1;
        else return 0;
    }

    public static void main(String args[]){
        CheckPositiveNegative obj = new CheckPositiveNegative();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int res = obj.CheckNumber(n);
        if (res == 1) System.out.println("Positive Number");
        else if (res == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
        sc.close();
    }
}