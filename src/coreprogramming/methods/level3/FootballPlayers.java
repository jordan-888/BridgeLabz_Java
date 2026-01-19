
package coreprogramming.methods.level3;
import java.lang.Math;

public class FootballPlayers {
    public static double sum(int[] heights) {
        double heightsSum = 0;
        for (int i = 0; i < 11; i++) {
            heightsSum += heights[i];
        }
        return heightsSum;
    }

    public static double mean(double heightsSum) {
        return heightsSum / 11;
    }

    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 0; i < 11; i++) {
            if (shortest > heights[i])
                shortest = heights[i];
        }
        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 0; i < 11; i++) {
            if (tallest < heights[i])
                tallest = heights[i];
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        double heightsSum = sum(heights);
        System.out.println("The sum of the heights is: " + heightsSum);
        System.out.printf("The mean of the heights is: %.2f\n", mean(heightsSum));
        System.out.println("The shortest height is: " + shortestHeight(heights));
        System.out.println("The tallest height is: " + tallestHeight(heights));
    }
}