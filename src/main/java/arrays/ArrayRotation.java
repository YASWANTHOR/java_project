package arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int x = 2; // Number of positions to rotate

        rotateArrayLeft(arr, x);

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayLeft(int[] arr, int x) {
        int n = arr.length;
        if (arr == null || x < 0 || x > n) {
            System.out.println("Invalid rotation");
            return;
        }

        // Make x within the bounds of the array length
        x = x % n;

        // Temporary array to store first x elements
        int[] temp = new int[x];

        // Copy first x elements into temp
        for (int i = 0; i < x; i++) {
            temp[i] = arr[i];
        }

        // Shift the rest of the array
        for (int i = x; i < n; i++) {
            arr[i - x] = arr[i];
        }

        // Copy the stored elements back
        for (int i = 0; i < x; i++) {
            arr[n - x + i] = temp[i];
        }
    }
}

