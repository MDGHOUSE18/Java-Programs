package Strings;

public class PrintInitials {
    public static void main(String[] args) {
        // Nine rows of pattern
        String[] initials = new String[9];

        // K pattern
        initials[0] = "**        ***   **********        **             *               **";
        initials[1] = "**      ***     **        **       **           ***             **";
        initials[2] = "**    ***       **         **       **         **  **          **";
        initials[3] = "**  ***         **          **       **       **    **        **";
        initials[4] = "*****           **           **       **     **      **      **";
        initials[5] = "**  ***         **          **         **   **        **    **";
        initials[6] = "**    ***       **         **           ** **           ** **";
        initials[7] = "**      ***     **        **             ***             ***";
        initials[8] = "**        ***   **********                *               *";
        System.out.println();
        // Printing the initials in 9 rows
        for (int i = 0; i < initials.length; i++) {
            System.out.println(initials[i]);
        }
        System.out.println();
    }
}
