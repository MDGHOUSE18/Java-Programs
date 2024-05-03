package Functions;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(isPrime(number)){
            System.out.println("The number "+number+" is a pirme number");
        }else{
            System.out.println("The number "+number+" is not a pirme number");
        }
        sc.close();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number%2==0) {
                return false;
            }
        }
        return true;
    }
}
