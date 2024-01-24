package arraylist;

import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("This is a test");

        // Using a traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}

