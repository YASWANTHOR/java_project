package polymorphism;

// Class for demonstration extending Department
public class DepartmentDemo extends Department {
    private int departmentSize = 40;

    // Implementation of the abstract method
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    public static void main(String[] args) {
        // Creating an instance of the polymorphism.DepartmentDemo class
        DepartmentDemo departmentDemo = new DepartmentDemo();

        // Calling the implemented method
        int size = departmentDemo.getDepartmentSize();

        // Printing the result
        System.out.println("Department size: " + size);
    }
}
