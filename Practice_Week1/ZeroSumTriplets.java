import java.util.Scanner;

public class ZeroSumTriplets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i<n-2 ; i++){
            for(int j = i+1 ; j<n-1 ; j++){
                for(int k = j+1 ; k<n ; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("Triplet found: " + arr[i] + "," + arr[j] + "," + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total number of triplets: " + count);
        sc.close();
    }
}