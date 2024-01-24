package arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40}; // Example array
        int x = 10; // Element to be searched

        int result = linearSearch(arr, x);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }

    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i; // Return the index of the element if found
        }
        return -1; // Element not found
    }
}

