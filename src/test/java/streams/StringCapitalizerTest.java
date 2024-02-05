package streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringCapitalizerTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] input = {"apple", "Orange", "banana", "grape"};
        String[] expected = {"Apple", "Banana", "Grape", "Orange"};
        assertArrayEquals(expected, StringCapitalizer.capitalizeAndSort(input));
    }

    @Test
    public void testEmptyArray() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, StringCapitalizer.capitalizeAndSort(input));
    }

    @Test
    public void testSingleElementArray() {
        String[] input = {"mango"};
        String[] expected = {"Mango"};
        assertArrayEquals(expected, StringCapitalizer.capitalizeAndSort(input));
    }

    @Test
    public void testAllCapsInput() {
        String[] input = {"APPLE", "ORANGE", "BANANA", "GRAPE"};
        String[] expected = {"Apple", "Banana", "Grape", "Orange"};
        assertArrayEquals(expected, StringCapitalizer.capitalizeAndSort(input));
    }
}

