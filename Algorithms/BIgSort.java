import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BIgSort {
    public static List<String> bigSorting(List<String> input) {
    Collections.sort(input, (a, b) -> {
        if (a.length() != b.length()) {
            return Integer.compare(a.length(), b.length());
        }
        return a.compareTo(b);
    });
    return input;
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("3", "123", "45", "456", "7890", "12");
        List<String> sortedInput = bigSorting(input);
        System.out.println(sortedInput);
    }
}
