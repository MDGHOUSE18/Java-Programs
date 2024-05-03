package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        System.out.println("The factorial of "+number+" is "+factorial(number));
        sc.close();
    }

    private static int factorial(int number) {
        int result=1;
        for (int i = 1; i <= number; i++) {
            result*=i;
        }
        return result;
    }
}
