package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first=sc.nextInt();
        System.out.print("Enter two number : ");
        int second=sc.nextInt();
        System.out.println("The sum of two numbers are "+sum(first,second));
        sc.close();
    }
    public static int sum(int first,int second){
        return first+second;
    }
}
