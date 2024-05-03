package Functions;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(isPolindrome(number)){
            System.out.println("The number "+number+" is a polindrome");
        }else{
            System.out.println("The number "+number+" is not a polindrome");
        }
        sc.close();
    }

    private static boolean isPolindrome(int number) {
        int temp=number,reverse=0;
        while (temp>0) {
            int rem=temp%10;
            reverse=(reverse*10)+rem;
            temp/=10;
        }
        return number==reverse;
    }
}
