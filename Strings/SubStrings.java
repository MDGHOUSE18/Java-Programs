package Strings;

/**
 * SubStrings
 */
public class SubStrings {

    public static void printAllSubstring(String st, int k) {
        int n = st.length();
        for (int s = 0; s <= (n - k); s++) {
            System.out.println(st.substring(s, s+k));
        }
    }
    public static void main(String[] args) {
        String s = "tapacademy";
        int k = 3;
        printAllSubstring(s,k);
    }
        
}