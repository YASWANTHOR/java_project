package constructorstaticfinal;

public class MyStaticClass {
    // Static variable of type int with different names
    
    private static int count;
    
    // Static method that returns an int
    public static int getStaticNumber() {
        return count;
    }

    public static void main(String[] args) {
        // Setting the value of the static variable
        count = 10;

        // Calling the static method to get the value
        int result = getStaticNumber();
        System.out.println("Value of staticCount: " + result);
    }
    
}
