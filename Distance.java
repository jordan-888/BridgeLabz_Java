import java.lang.Math;

public class Distance{
    public static void main(String args[]){
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        System.out.printf("%.2f%n",Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        
    }
}