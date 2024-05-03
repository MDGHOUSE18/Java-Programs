package Functions;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers : ");
        int first=sc.nextInt(),last=sc.nextInt();
        System.out.print("The prime numbers between "+first+" and "+last+" are ");
        primeNumbersInRange(first,last);
        sc.close();
    }

    public static void primeNumbersInRange(int first, int last) {
        // first=(first==0 || first==1)?2:first;
        for (int i = first; i < last; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number==0 || number==1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%2==0) {
                return false;
            }
        }
        return true;
    }
}
