package loopconditions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
