package loopconditions;

public class AgeCategory {

    public static void main(String[] args) {
        // Example usage
        printAgeCategory(10); // Output: kid
        printAgeCategory(15); // Output: teen
        printAgeCategory(25); // Output: adult
    }

    public static void printAgeCategory(int age) {
        if (age < 13) {
            System.out.println("kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("teen");
        } else {
            System.out.println("adult");
        }
    }
}
