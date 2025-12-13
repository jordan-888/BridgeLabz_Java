import java.util.Scanner;

interface Combined5_10{
    double[] QnR(int a, int b);
    int[] Swap(int a, int b);
    boolean isEven(int a);
    boolean isVowel(char a);
    int Largest(int a, int b, int c);
}

public class DayOneQ6_10 implements Combined5_10 {

    public double[] QnR(int a, int b) {
        return new double[] {(double)a / b, a % b};
    }

    
    public int[] Swap(int a, int b) {
        return new int[] {b, a};
    }

    
    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    
    public boolean isVowel (char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    
    public int Largest(int a, int b, int c) {
        return (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
    }

    public static void main(String[] args) {
        DayOneQ6_10 obj = new DayOneQ6_10();

        while(true){
            System.out.println("\nChoose an option:\n1. Quotient and Remainder \n2. Swap two numbers \n3. Check Even/Odd \n4. Check Vowel/Consonant \n5. Find Largest among three numbers \n") ;
            try(Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    double[] res = obj.QnR(a, b);
                    System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
                    return;
                
                case 2:
                    System.out.print("Enter two numbers to swap: ");
                    int[] swapped = obj.Swap(sc.nextInt(), sc.nextInt());
                    System.out.println("After swapping: " + swapped[0] + " " + swapped [1]);
                    return;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(num + " is " + (obj.isEven(num) ? "Even" : "Odd"));
                    return;

                case 4:
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);
                    System.out.println(ch + " is " + (obj.isVowel(ch) ? "Vowel" : "Consonant"));
                    return;
                
                case 5:
                    System.out.print("Enter three numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    System.out.println("Largest number is: " + obj.Largest(x, y, z));
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    return;
            }
            }
        }
    }
}
