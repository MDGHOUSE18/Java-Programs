package Functions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int number=sc.nextInt();
        System.out.println("The sum of first "+number+" natural numbers "+sum(number));
        sc.close();
    }

    public static int sum(int number) {
        int sum=0;
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        return sum;
    }
}
