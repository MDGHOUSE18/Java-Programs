/**
 * WAJP to check whether the given number is Duck number or not.
 * A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers. 
 * Please note that a numbers with only leading 0s is not considered as Duck Number. 
 * For example, numbers like 035 or 0012 are not considered as Duck Numbers. 
 *  A number like 01203 is considered as Duck because there is a non-leading 0 present in it.

    Examples :

    Input : 707069 
    Output : It is a duck number. 
    Explanation: 707069 does not contains zeros at the beginning.

    Input : 02364 
    Output : It is not a duck number. 
    Explanation: in 02364 there is a zero at the beginning of the number.
 */
import java.util.Scanner;
public class DuckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        if(check_duck(number)){
            System.out.println(number+" is a duck number");
        }else{
            System.out.println(number+" is not a duck number");
        }
        sc.close();
    }

    public static boolean check_duck(String s){
        if (s.charAt(0)=='0') {
            return false;
        }

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0') return true;
        }


        return false;
    }
    
}