package Functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number=sc.nextInt();
        if(isEven(number)){
            System.out.println("The given number "+number+" is Even.");
        }else{
            System.out.println("The given number "+number+" is Odd.");
        }
        sc.close();
    }
    public static boolean isEven(int number){
        if (number%2==0) {
            return true;
        }
        return false;
    }
}
