import java.util.Scanner;
import java.io.PrintWriter;

public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n]; 
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        PrintWriter out = new PrintWriter(System.out, true);
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                out.print(arr[i][j] + " ");
            }
            out.printf("\n");
        }
        out.close();
    }
}