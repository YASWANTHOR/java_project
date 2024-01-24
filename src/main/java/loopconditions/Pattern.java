package loopconditions;

public class Pattern {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Printing '+' symbols
            for (int j = 0; j < rows - i; j++) {
                System.out.print("+");
            }

            // Printing '-' symbols
            for (int k = 0; k < i; k++) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

