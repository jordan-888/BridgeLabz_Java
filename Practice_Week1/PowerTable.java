import java.lang.Math;

public class PowerTable {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        
        for (int i = 0 ; i <= n; i++) {
            int square = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + square);
        }
    }
}