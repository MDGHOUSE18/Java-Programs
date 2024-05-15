package Strings;

// import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        System.out.println(reversedString1("the sky blue"));
    }

    public static String reversedString(String string) {
        String reversed = "";
        String[] arrString = string.split(" ");
        for (int i = arrString.length - 1; i >= 0; i--) {
            reversed = reversed + arrString[i] + " ";
        }
        return reversed;
    }

    // optimized method using stringbuilder
    public static String reversedString1(String string) {
        // Split the string into words
        String[] words = string.split(" ");

        // Use StringBuilder for efficient string concatenation
        StringBuilder reversedString = new StringBuilder();

        // Iterate over the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }

        // Convert StringBuilder to String and return
        return reversedString.toString();
    }
}
