import java.util.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=0){sc.close(); return ;  }
        double HarmonicNumber = 0.0;
        for (int i = 1; i <= n; i++) {
            HarmonicNumber += 1.0 / i;
        }
        System.out.println("Harmonic Number: " + String.format("%.2f", HarmonicNumber));
        sc.close();
    }
}