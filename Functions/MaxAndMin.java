package Functions;

import java.util.Scanner;



public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
        System.out.println("Maximum : " + max(first, second, third) + "\nMinimum : " + min(first, second, third));
        sc.close();
    }

    public static int max(int a, int b, int c) {
        if ((a>b)&&(a>c)) {
            return c;
        }else if (b>c) {
            return b;
        }else{
            return c;
        }
    }

    public static int min(int a, int b, int c) {
        if ((a<b)&&(a<c)) {
            return c;
        }else if (b<c) {
            return b;
        }else{
            return c;
        }
    }
}
