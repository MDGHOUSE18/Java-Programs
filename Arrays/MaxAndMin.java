package Arrays;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number of integers to input
        System.out.print("Enter the number of integers to input : ");
        int n = sc.nextInt();

        // Create an numbersay to store the integers
        int[] numbers = new int[n];

        // Read the integers from the user
        System.out.print("Enter the integers separated by spaces: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Largest element in the array is: " + largest(numbers));
        System.out.println("Second largest element in the array is: " + secondLargest(numbers));
        System.out.println("Smallest element in the array is: " + smallest(numbers));
        System.out.println("Second smallest element in the array is: " + secondSmallest(numbers));
        sc.close();

    }
    public static int largest(int[] numbers){
        // Check if the numbersay length is less than 2
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }
        int max=numbers[0];
        for (int num:numbers) {
            if (max<num) {
                max=num;
            }
        }
        return max;
    }
    public static int secondLargest(int[] numbers){
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }
        int max=numbers[0],secondMax=numbers[0];
        for (int num:numbers) {
            if (max<num) {
                secondMax=max;
                max=num;
            }else if(secondMax < num && num != max){
                secondMax=num;
            }
        }
        return secondMax;
    }
    public static int smallest(int[] numbers){
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }
        int min=numbers[0];
        for (int num : numbers) {
            if(min>num){
                min=num;
            }
        }
        return min;
    }
    public static int secondSmallest(int[] numbers){
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }
        int min=numbers[0],secondmin=numbers[0];
        for (int num : numbers) {
            if(min>num){
                secondmin=min;
                min=num;
            }else if(secondmin > num && num != min){
                secondmin=num;
            }
        }
        return secondmin;
    }
}
