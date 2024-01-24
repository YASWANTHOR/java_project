package constructorstaticfinal;

// constructorstaticfinal.Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of constructorstaticfinal.ChildClass using the first constructor
        ChildClass instance1 = new ChildClass(10, 20);

        // Create an instance of constructorstaticfinal.ChildClass using the overloaded constructor
        ChildClass instance2 = new ChildClass(30);

        // Access instance variables
        System.out.println("Instance 1 - Parent Variable: " + instance1.parentVariable);
        System.out.println("Instance 1 - Child Variable: " + instance1.childVariable);

        System.out.println("Instance 2 - Parent Variable: " + instance2.parentVariable);
        System.out.println("Instance 2 - Child Variable: " + instance2.childVariable);
    }
}

