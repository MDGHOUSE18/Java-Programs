package Control_Statements.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number=sc.nextInt(),sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("Factorial of the "+number+" is "+sum);
        sc.close();
    }
}
