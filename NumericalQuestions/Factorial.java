import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        System.out.println("Factorial of "+number+" is "+fact(number));
        sc.close();
    }
    public static long fact(int num){
        if (num==1) {
            return 1;
        }
        return num*fact(num-1);
    }
}
