/*
 * WAJP to check whether the given input is a happy number or not.
 * A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by 
 * the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. 

    Examples : 

    Input: n = 19
    Output: True
    19 is Happy Number,
    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1
    As we reached to 1, 19 is a Happy Number.

    Input: n = 20
    Output: False
 */
import java.util.Scanner;
import java.util.HashSet;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(isHappyNumber(number)){
            System.out.println(number+" is a Happy Number");
        }else{
            System.out.println(number+" is not a Happy Number");
        }
        sc.close();
    }

    //  method return true if n is Happy Number
    public static int numSquareSum(int n)
    {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }

    public static boolean happyNumber(int n){
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }
    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = numSquareSum(slow); // Move slow pointer one step
            fast = numSquareSum(numSquareSum(fast)); // Move fast pointer two steps
        } while (slow != fast);

        // If both meet at 1, it's a Happy Number
        return slow == 1;
    }
}
