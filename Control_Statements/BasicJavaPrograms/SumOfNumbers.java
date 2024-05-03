package Control_Statements.BasicJavaPrograms;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,number;
        System.out.println("Enter integers (enter 0 to finish):");
        do {
            number=sc.nextInt();
            sum+=number;
        } while (number!=0);
        sc.close();
        System.out.println("Sum of the entered numbers: " + sum);
    }
}
