package NumericalQuestions;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Array to store the frequency of each die result (1-6)
        int[] frequency = new int[6];

        // Roll the die 20 times
        for (int i = 0; i < 20; i++) {
            int roll = rand.nextInt(6) + 1; // Random number between 1 and 6
            frequency[roll - 1]++; // Increment the frequency of the rolled number
        }

        // Find the number that came up the maximum number of times
        int maxIndex = 0;
        for (int i = 1; i < 6; i++) {
            if (frequency[i] > frequency[maxIndex]) {
                maxIndex = i;
            }
        }

        

        // Calculate the percentage for the most frequent number
        int maxNumber = maxIndex + 1;
        int maxCount = frequency[maxIndex];
        double percentage = (maxCount / 20.0) * 100;

        System.out.println("\nNumber " + maxNumber + " came up the maximum number of times: " + maxCount);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}

