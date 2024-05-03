package Functions;

import java.util.Scanner;

public class Circle {
    static final double PI=Math.PI;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        int radius=sc.nextInt();
        System.out.printf("Area of circle is %.2f\n",area(radius));
        System.out.printf("Area of circle is %.2f\n",circumference(radius));
        sc.close();
    }
    public static double area(int radius) {
        return PI*radius*radius;
    }
    public static double circumference(int radius) {
        return 2*PI*radius;
    }
}
