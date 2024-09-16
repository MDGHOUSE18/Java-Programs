package Arrays.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={7,8,3,1,2,9,10,11,12};
        System.out.println("Before Sorting : ");
        printArray(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println("After Sorting : ");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        
    }
}
