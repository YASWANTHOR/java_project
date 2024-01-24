package arrays;

public class SmallestLargestArray {
    public static void main(String[] args) {
        int[] numbers = {34, 53, 74, 2, 90, 12, 45}; // Example array
        findLargestAndSmallest(numbers);
    }

    public static void findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}
