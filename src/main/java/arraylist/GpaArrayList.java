package arraylist;


import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + GPA + ")";
    }
}

public class GpaArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Doe", 2.8));
        students.add(new Student("Alice", "Johnson", 3.7));
        students.add(new Student("Bob", "Smith", 2.4));

        // Calculating the average GPA
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / students.size();

        // Removing students with GPA less than the average GPA
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).GPA < averageGPA) {
                students.remove(i);
            }
        }

        // Printing the remaining students
        System.out.println("Students with GPA >= average GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

