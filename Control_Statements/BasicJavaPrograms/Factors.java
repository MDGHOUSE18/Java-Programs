package Control_Statements.BasicJavaPrograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number=sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            if (Number%i==0) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
