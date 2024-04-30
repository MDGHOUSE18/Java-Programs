package Patterens;

public class Patterns {
    public static void main(String[] args) {
        Pattern3(4);
        // System.out.println("Hello");
    }

    static void Pattern1(int n) {
        // Square Star Pattern
        // ****
        // ****
        // ****
        // ****
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        // Hollow Square Star Pattern
        // ****
        // *  *
        // *  *
        // ****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        // Rhombus Star Pattern
        // ****
        //  ****
        //   ****
        //    ****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++) {
            	System.out.print("*");
            }
            System.out.println();
        }
    }
}
