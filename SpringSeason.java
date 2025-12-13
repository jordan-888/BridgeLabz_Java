import java.util.Scanner;

public class SpringSeason {
    public boolean CheckSeason(int m, int d){
        if(m==3 && d>=20) return true;
        else if(m==6 && d<=20) return true;
        else if(m==4 || m==5) return true;
        else return false;
    }
    public static void main(String args[]){
        SpringSeason obj = new SpringSeason();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day : ");
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(obj.CheckSeason(m, d)) System.out.println("It is Spring Season");
        else System.out.println("It is not Spring Season");
        sc.close();
    }
}