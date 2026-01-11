import java.lang.Math;

public class WindChill {
    public static void main(String args[]){
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if(t>50 || v<3 || v>120){
            System.out.println("Invalid Input");
            return;
        }
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);

        System.out.printf("Wind Chill is : %.2f%n", w);
    }
}