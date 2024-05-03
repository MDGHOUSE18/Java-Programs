package Control_Statements.BasicJavaPrograms;
/*
1281. Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 
Constraints:

1 <= n <= 10^5 */
public class LeetCode_1281 {
    public static int sum(int n)
    {
        return n < 2 ? n : n % 10 + sum(n / 10);
    }

    public static int product(int n)
    {
        return n < 2 ? 1 : n % 10 * product(n / 10);
    }
    public static int subtractProductAndSum(int n) {
        // int sum=0,pro=1;
        // while(n>0){
        //     int temp=n%10;
        //     sum+=temp;
        //     pro*=temp;
        //     n=n/10;
        // }
        // return pro-sum;
        return product(n)-sum(n);
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
