// Package declaration
package constructorstaticfinal;

// Final class
final class RestrictedClass {

    // Final variable
    final int restrictedVariable = 10;

    // Final method accessible only within the same package
    final void restrictedMethod() {
        System.out.println("This method can only be accessed within the same package.");
    }

    // constructorstaticfinal.Main class with a main method
    public static class MainClass {

        public static void main(String[] args) {
            // Create an instance of RestrictedClass
            RestrictedClass restrictedObj = new RestrictedClass();

            // Access the final variable
            System.out.println("Restricted Variable: " + restrictedObj.restrictedVariable);

            // Access the final method
            restrictedObj.restrictedMethod();
        }
    }
}

