package arraylist;


import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        // Initialize the ArrayList with some elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("This is a test");

        // Displaying the original list
        System.out.println("Original ArrayList: " + stringList);

        // Remove the last element
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
        }

        // Displaying the list after removal
        System.out.println("ArrayList after removing the last element: " + stringList);
    }
}

