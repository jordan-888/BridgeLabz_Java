
package coreprogramming.methods.level3;

public class BonusSalary {
    public static int[][] calcSalary() {
        int[][] salaryInfo = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int salary = (int) (Math.random() * 90000) + 10000;
            salaryInfo[i][0] = salary;
            int serviceYears = (int) (Math.random() * 10);
            salaryInfo[i][1] = serviceYears;
        }
        return salaryInfo;
    }

    public static double[][] calcBonus(int[][] salaryInfo) {
        double[][] newSalary = new double[10][2];
        for (int i = 0; i < 10; i++) {
            if (salaryInfo[i][1] > 5) {
                newSalary[i][0] = salaryInfo[i][0] * 0.05;
                newSalary[i][1] = salaryInfo[i][0] + (salaryInfo[i][0] * 0.05);
            } else {
                newSalary[i][0] = salaryInfo[i][1];
                newSalary[i][1] = salaryInfo[i][0] + (salaryInfo[i][0] * 0.02);
            }
        }
        return newSalary;
    }

    public static double[] total(int[][] salaryInfo, double[][] newSalary) {
        double totalOldSal = 0;
        double totalNewSal = 0;
        double totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            totalOldSal += salaryInfo[i][0];
            totalNewSal += newSalary[i][1];
            totalBonus += newSalary[i][0];
        }
        return new double[] { totalOldSal, totalNewSal, totalBonus };
    }

    public static void main(String[] args) {
        int[][] salaryInfo = calcSalary();
        double[][] newSalary = calcBonus(salaryInfo);
        double[] total = total(salaryInfo, newSalary);
        System.out.printf("Old Salary\tNew Salary\tTotalSalary\n%10.2f\t%10.2f\t%11.2f\n", total[0], total[1],
                total[2]);
    }
}