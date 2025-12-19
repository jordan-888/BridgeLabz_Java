import java.util.Scanner;

public class Adjacent{
    public static int[] swap(int[] temp){
        int x = 0;
        int n = temp.length;
        for(int i = 0 ; i<n-1 ;i+=2){
            x = temp[i];
            temp[i] = temp[i+1];
            temp[i+1] = x;
        }
        return temp;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int[] arr = new int[input.nextInt()];
        System.out.print("Enter an array of integers : \n");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = input.nextInt();
        }

        int[] ans = swap(arr);
        System.out.println("Swapped array is : ");
        for(int i = 0 ; i<ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.print("\n");
        input.close();
    }
}