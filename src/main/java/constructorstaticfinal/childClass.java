package constructorstaticfinal;

// Child class extending the constructorstaticfinal.ParentClass
class ChildClass extends ParentClass {
    // Instance variable in the child class
    int childVariable;

    // Constructor in the child class to initialize both instance variables
    ChildClass(int parentVariable, int childVariable) {
        super(parentVariable); // Call the constructor of the parent class
        this.childVariable = childVariable;
    }

    // Overloaded constructor in the child class with one parameter
    ChildClass(int childVariable) {
        super(0); // Default value for parentVariable
        this.childVariable = childVariable;
    }
}

