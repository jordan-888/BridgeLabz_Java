import java.lang.Math;

public class TrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String args[]){
        double angle = Double.parseDouble(args[0]);
        TrigonometricFunctions obj = new TrigonometricFunctions();
        double[] results = obj.calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f%n", results[0], results[1], results[2]);
    }
}