import java.util.Scanner;
import java.util.Arrays;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c){
        
        int arr[] = {a, b, c};
        Arrays.sort(arr);
        int newArr[] = {arr[0], arr[2]};
        return newArr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ans = SmallestAndLargest.findSmallestAndLargest(a, b, c);
        System.out.printf("Smallest and Largest numbers are : %d and %d%n", ans[0], ans[1]);
        sc.close();
    }
}