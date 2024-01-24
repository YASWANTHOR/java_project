package loopconditions;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Example: Printing first 10 terms of Fibonacci series
        printFibonacciSeries(10);
    }

    public static void printFibonacciSeries(int N) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= N; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
