package arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12}; // Example array
        moveZerosToEnd(numbers);

        // Print the modified array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
