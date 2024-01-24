package arraylist;


import java.util.ArrayList;

public class ArrayListArray {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        // Converting ArrayList to an array of Strings
        String[] stringArray = stringList.toArray(new String[0]);

        // Printing the array to verify the conversion
        System.out.println("Array Elements: ");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

