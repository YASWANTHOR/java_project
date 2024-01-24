package arrays;

public class ReverseArray {
    
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5}; // Example array
        int[] reversedArray = reverse(originalArray);

        System.out.println("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Return the original array if it's empty or null
        }

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
}

