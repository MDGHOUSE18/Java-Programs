public class PasswordValidator {

    static int solve(String password) {
        String specialCharacters = "!@#$%^&*()-+";
        int addNum = 0;

        // Check if the password contains a digit
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (specialCharacters.indexOf(ch) != -1) hasSpecial = true;
        }

        if (!hasDigit) addNum++;
        if (!hasLower) addNum++;
        if (!hasUpper) addNum++;
        if (!hasSpecial) addNum++;

        // Ensure the password is at least 6 characters long
        if (password.length() < 6) {
            addNum = Math.max(addNum, 6 - password.length());
        }

        return addNum;
    }

    public static void main(String[] args) {
        // Example usage:
        String password = "Ab1";
        System.out.println(solve(password));  // Output will be the number of characters needed to make the password strong
    }
}

