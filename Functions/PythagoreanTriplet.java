package Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int first=sc.nextInt(),second=sc.nextInt(),third=sc.nextInt();
        if (isPythagorean(first,second,third)) {
            System.out.println("The given triplet is a Pythagorean triplit");
        }else{
            System.out.println("The given triplet is not a Pythagorean triplit");
        }
        sc.close();
    }
    public static boolean isPythagorean(int first,int second,int third){
        return ((first*first)+(second*second))==third*third;
    }
}
