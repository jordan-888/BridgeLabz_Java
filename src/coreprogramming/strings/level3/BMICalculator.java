
package coreprogramming.strings.level3;
import java.util.Scanner;

public class BMICalculator {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height from cm to meters
            double heightM = heightCm / 100.0;

            // Calculate BMI
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            // Determine status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(bmi);
            result[i][1] = status;
        }

        return result;
    }

    public static String[][] processData(double[][] data) {
        String[][] bmiData = calculateBMI(data);
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][1]); // Height
            result[i][1] = String.valueOf(data[i][0]); // Weight
            result[i][2] = bmiData[i][0]; // BMI
            result[i][3] = bmiData[i][1]; // Status
        }

        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("==========================================================");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" +
                    results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = input.nextDouble();
        }

        String[][] results = processData(data);
        displayResults(results);

        input.close();
    }
}
