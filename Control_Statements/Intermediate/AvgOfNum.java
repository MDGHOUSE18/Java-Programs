package Control_Statements.Intermediate;

import java.util.Scanner;

public class AvgOfNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of all elements : ");
        int number=sc.nextInt();
        System.out.println("The avg of give numbers are " + Avg(number));
        
    }
    public static double Avg(int number) {
        int count=1,sum=0;
        while (count<=number) {
            System.out.print("Enter the "+count+" number : ");
            sum+=sc.nextInt();
            count++;
        }
        return sum/number;
    }
}
