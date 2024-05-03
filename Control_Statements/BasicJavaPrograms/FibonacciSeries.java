

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth Number : ");
        int Number=sc.nextInt();
        int a=0,b=1;
        while (Number>0) {
            int temp=b;
            b=a+b;
            a=temp;
            Number--;
        }
        System.out.println(b);
    }
}
