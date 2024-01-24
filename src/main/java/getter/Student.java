package getter;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Example usage with direct initialization
        Student student = new Student();
        student.name = "Yaswanth";
        System.out.println("getter.Student Name: " + student.getName());
    }
}

