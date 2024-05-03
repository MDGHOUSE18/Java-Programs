package Functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age=sc.nextInt();
        if(isEven(age)){
            System.out.println("He/She is eligible to vote ");
        }else{
            System.out.println("He/She is not eligible to vote ");
        }
        sc.close();
    }
    public static boolean isEven(int age){
        if (age>=18) {
            return true;
        }
        return false;
    }
}
