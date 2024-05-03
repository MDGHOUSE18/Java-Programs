package Control_Statements.BasicJavaPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestNumber=Integer.MIN_VALUE,number;
        System.out.println("Enter integers (enter 0 to finish):");
        while ((number=sc.nextInt())!=0) {
            // if(largestNumber<number){
            //     largestNumber=number;
            // }
            largestNumber = (number > largestNumber) ? number : largestNumber;
        }
        System.out.println("Largest number entered: " + largestNumber);
        sc.close();
    }
}
