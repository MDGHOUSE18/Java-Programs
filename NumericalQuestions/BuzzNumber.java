/*
 * 5.WAJP to check whether the given number is Buzz number or not. 
 * 6. WAJP to display all the Buzz numbers in the user defined start and end range.
 * A number is said to be Buzz Number if it ends with 7 OR is divisible by 7. 
    The task is to check whether the given number is buzz number or not.
    Examples: 
    
    Input : 63
    Output : Buzz Number
    Explanation: 63 is divisible by 7, one
    of the condition is satisfied.

    Input : 72
    Output : Not a Buzz Number
    Explanation: 72 % 7 != 0, 72 is neither 
    divisible by 7 nor it ends with 7 so 
    it is not a Buzz Number.
 */

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(isBuzzNumber(number)){
            System.out.println(number+" is a Buzz Number");
        }else{
            System.out.println(number+" is not a Buzz Number");
        }
        sc.close();
    }
    public static boolean isBuzzNumber(int num){
        return (num%10==7 || num%7==0);
    }
    
}
