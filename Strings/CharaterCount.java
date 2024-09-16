package Strings;

import java.util.Scanner;

public class CharaterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        System.out.print("Enter the charater to count : ");
        char ch=sc.next().charAt(0);
        System.out.println("vowels count are "+charCount(str,ch));
    }

    private static int charCount(String str,char ch) {
        int count=0;
        for(char c:str.toCharArray()){
            if (ch==c) {
                count++;
            }
        }

        return count;
    }
}
