package Strings;
public class PangramChecker {

    public static String pangrams(String s) {
        s = s.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        return count == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangrams(input));  // Output: pangram

        String input2 = "Hello world";
        System.out.println(pangrams(input2)); // Output: not pangram
    }
}
