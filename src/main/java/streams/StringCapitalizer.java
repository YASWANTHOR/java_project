package streams;

import java.util.Arrays;

public class StringCapitalizer {

    public static String[] capitalizeAndSort(String[] input) {
        return Arrays.stream(input)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "Orange", "banana", "grape"};
        String[] capitalizedSorted = capitalizeAndSort(strings);
        System.out.println(Arrays.toString(capitalizedSorted));
    }
}

