package Basics;

import java.util.Scanner;

/**
 * NumericalQuestions
 */
class NumericalQuestions {

    public static void main(String[] args) {
        System.out.println("Numerical Questions");
    }
}

// 1. WAJP to check whether the given number is Armstrong or not.

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Number ");
        int number = sc.nextInt();
        int numDigits = String.valueOf(number).length();
        // System.out.println(numDigits);
        // int result=(int)((Math.pow(number, numDigits))+(Math.pow(number, numDigits))+(Math.pow(number, numDigits)));
        int result = 0;
        for (int i = 0; i < numDigits; i++) {
            int temp=number%10;
            number=number/10;
            result += (int) Math.pow(temp, numDigits);
        }
        System.out.println(result);
    }

}


class OptimizedArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }

        int originalNumber = n;
        int sum = 0;
        int numDigits = 0;

        while (originalNumber > 0) {
            numDigits++;
            originalNumber /= 10;
        }

        originalNumber = n;
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numDigits);
            originalNumber /= 10;
        }

        return sum == n;
    }
}


