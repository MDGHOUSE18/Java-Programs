package Infanion;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of digits : ");
        int digits=sc.nextInt();
        System.out.print("Enter the nth highest : ");
        int nthHighest=sc.nextInt();
        int number=nthPrimeNum(digits,nthHighest);
        System.out.println(nthHighest+"th highest prime number in "+digits+"digit number is "+number);
    }

    public static int nthPrimeNum(int digits, int nthHighest) {
        int start=(int) Math.pow(10, digits);
        int end=start/10;
        int count=0;
        for (int i = start; i >= end; i--) {
            if (isPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
            if (count==nthHighest) {
                return i;
            }
        }
        return 0;
    }
    public static boolean isPrime(int num){
        if (num==1 || num<0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }

        return true;
    }
}
