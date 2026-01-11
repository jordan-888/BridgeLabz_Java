import java.util.Random;
import java.util.Scanner;

public class CoinFlipPercentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of coin flips: ");
        int numberOfFlips = sc.nextInt();

        int headsCount = 0;
        int tailsCount = 0;
        for(int i = 0; i < numberOfFlips; i++){
            if(rand.nextDouble() < 0.5){
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsPercentage = ((double) headsCount / numberOfFlips) * 100;
        double tailsPercentage = ((double) tailsCount / numberOfFlips) * 100;

        System.out.printf("Heads: %.2f%%\n", headsPercentage);
        System.out.printf("Tails: %.2f%%\n", tailsPercentage);
        sc.close();
    }
}
