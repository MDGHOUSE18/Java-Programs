import java.util.Scanner;


/*
Given a number x, determine whether the given number is Armstrong’s number or not.

A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... 
Example: 

Input:153
Output: Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153

Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input: 1253
Output: No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

Input: 1634
Output: Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

1.WAJP to check whether the given number is Armstrong or not.
2. WAJP to display all the Armstrong numbers in the user defined start and end range. 
3.Find nth Armstrong Number 
*/
public class Armtstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        // System.out.println(num+"th Aromstrong number is "+NthArmstrong(num));
        if(isArmstrong(num)){
            System.out.println(num+" is armstrong number");
        }else{
            System.out.println(num+" is not armstrong number");
        }
        // System.out.print("Enter the first number : ");
        // int start=sc.nextInt();
        // System.out.print("Enter the second number : ");
        // int end=sc.nextInt();
        // armstrongNumbers(start, end);
        
        sc.close();
    }

    public static boolean isArmstrong(int number){
        // int n=Integer.toString(number).length();
        int exp = (int)Math.log10(number) + 1;
        int sum=0,temp=number;
        while (temp!=0) {
            int r=temp%10;
            // sum+=Math.pow(r, digit);
            sum+=power(r,exp);
            temp/=10;
        }
        return number==sum;
    }

    private static int power(int base, int exp) {
        if (exp==0) {
            return 1;
        }
        return base*power(base, exp-1);
    }

    public static void armstrongNumbers(int start,int end){
        System.out.print("The Armstrong numbers between "+start+" and "+end+" : ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    // Find nth Armstrong Number 
    public static int NthArmstrong(int n) {
        int count = 0;
    
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int num = i, rem, digit = 0, sum = 0;
    
            num = i;
    
            digit = (int)Math.log10(num) + 1;
    
            while (num > 0) {
                rem = num % 10;
                sum = sum + (int)Math.pow(rem, digit);
                num = num / 10;
            }
    
            if (i == sum)
                count++;
            if (count == n)
                return i;
        }
        return n;
    }
    
}
