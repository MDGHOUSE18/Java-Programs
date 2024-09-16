import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num=sc.nextInt();
        // if (isPrime(num)) {
        //     System.out.println(num+" is a prime number");
        // }else{
        //     System.out.println(num+" is not a prime number");
        // }
        primeNumbers(1, 10);

        
    }
    public static boolean isPrime(int num){
        if (num==1 || num<0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                return false;
            }
        }

        return true;
    }
    public static void primeNumbers(int start,int end){
        System.out.print("Prime numbers between "+start+" "+end+" are : ");
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }

       
    }
    
}
