package Functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first=sc.nextInt();
        System.out.print("Enter two number : ");
        int second=sc.nextInt();
        System.out.println("The product of two numbers are "+product(first,second));
        sc.close();
    }
    public static int product(int first,int second){
        return first*second;
    }
}
