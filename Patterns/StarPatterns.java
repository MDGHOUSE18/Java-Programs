package Patterns;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.err.print("Enter the number of rows : ");
        // int rows=sc.nextInt();
        simplePattern6(5);
    }
    /*Simple Pattern
        *****
        *****
        *****
        *****
        *****
    */
    public static void simplePattern1(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*Simple Pattern
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
    */
    public static void simplePattern2(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i==0 || i==rows-1 || j==0 || j==rows-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /*Simple Pattern
        *
        * *
        * * *
        * * * *
        * * * * *
    */
    public static void simplePattern3(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*Simple Pattern
                *
              * *
            * * *
          * * * *
        * * * * *
    */
    public static void simplePattern4(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <rows-1-i; j++) {
                System.out.print(" ");
            }
            for (int j =0 ; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    /*Simple Pattern
            * 
           * *
          * * *
         * * * *
        * * * * *
    */
    public static void simplePattern5(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <rows-1-i; j++) {
                System.out.print(" ");
            }
            for (int j =0 ; j <=i; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <(rows-1-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j =0 ; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows-1; i >=0; i--) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <(rows-1-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j =0 ; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void simplePattern6(int rows){
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <rows-1-i; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number );
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

}
