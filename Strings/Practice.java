package Strings;

public class Practice {
    public static void main(String[] args) {
        String input = "a2b3c1";
        String result = "";
        char[] characters = input.toCharArray();
        
        // Corrected loop increment and logic
        for (int i = 0; i < characters.length; i += 2) {
            char ch = characters[i];   // Get the character (e.g., 'a', 'b', 'c')

            int mul = characters[i + 1] - '0';  // Convert character digit to an integer (e.g., '2' -> 2)
            

            // Append the character 'mul' times
            for (int j = 0; j < mul; j++) {
                result += ch;
            }
        }
        
        System.out.println(result);

        
    }
    
}
