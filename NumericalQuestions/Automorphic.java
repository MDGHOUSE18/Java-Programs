/*
 * 1. WAJP to check whether the given number is Automorphic or not.
 * 2. WAJP to display all the Automorphic numbers in the user defined start and end range
 * 3.Nth automorphic number
 * 
 * Given a number N, the task is to check whether the number is an Automorphic number or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples : 

Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776

Input  : N = 25
Output : Automorphic
As 25*25 = 625

Input : N = 7
Output : Not Automorphic
As 7*7 = 49
 */

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        System.out.println(number+"th automorphic number is "+nthAutomorphicNumber(number));
        // if(isAutomorphic(number)){
        //     System.out.println(number+" is a Automorphic number");
        // }else{
        //     System.out.println(number+" is not a Automorphic number");
        // }
        // System.out.print("Enter the first number : ");
        // int start=sc.nextInt();
        // System.out.print("Enter the second number : ");
        // int end=sc.nextInt();
        // automorphicNumbers(start, end);
        sc.close();
    }
    // check whether the given number is Automorphic or not.
    public static boolean isAutomorphic(int num){
        int sq=num*num;
        while (num!=0) {
            if (sq%10 != num%10) {
                return false;
            }
            num=num/10;
            sq=sq/10;
        }
        return true;
    }
    // the Automorphic numbers in the user defined start and end range
    public static void automorphicNumbers(int start, int end){
        for(int i=start;i<=end;i++){
            if (isAutomorphic(i)) {
                System.out.print(i+" ");
            }
        }
    }
    // Nth automorphic number
    public static int nthAutomorphicNumber(int num){
        int number=1,count=0;
        while (num!=count) {
            if (isAutomorphic(number)) {
                count++;
            }
            number++;
        }
        return --number;
    }
}
