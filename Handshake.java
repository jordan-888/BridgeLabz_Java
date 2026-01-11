import java.util.Scanner;

public class Handshake {
    public int calculateHandshakes(int n) {
        return n * (n-1) / 2 ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Handshake obj = new Handshake();
        System.out.println("Total handshakes: " + obj.calculateHandshakes(n));
        sc.close();
    }
}