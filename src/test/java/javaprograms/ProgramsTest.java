package javaprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProgramsTest {
    Programs programs = new Programs();

    /***
     * Success and Failure case
     */
    @Test
    public void testPalindrome() {
        Assert.assertTrue(programs.isPalindrome(12321));
        Assert.assertFalse(programs.isPalindrome(1231));
    }

    /***
     * Testing the swap of two numbers
     */
    @Test
    public void testSwapping() {
        Assert.assertArrayEquals(new int[]{8, 9}, programs.swappingWithOutThird(9, 8));
    }

    /***
     * Testing Factorial
     */
    @Test
    public void testFactorial() {
        Assert.assertEquals(120, programs.getFactorial(5));
        Assert.assertNotEquals(120, programs.getFactorial(4));
        Assert.assertEquals(1, programs.getFactorial(0));
        Assert.assertEquals(-1, programs.getFactorial(-121));

    }

    /***
     * Testing repeated characters.
     */
    @Test
    public void testCharacterCount() {
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('c', 'a'));
        Assert.assertEquals(arrayList, programs.getRepeatedCharacters("canaca"));
    }

    /***
     * Testing unique word count.
     */
    @Test
    public void testGetUniqueWords() {
        Assert.assertEquals(6, programs.getCountUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, programs.getCountUniqueWords("yaswanth"));
        //Edge case
        Assert.assertEquals(0, programs.getCountUniqueWords(""));
    }

    /***
     * Checking the string rotation.
     */
    @Test
    public void testStringRotation() {
        Assert.assertTrue(programs.isStringRotated("venkata123", "123venkata"));
    }

    /***
     * Testing the sum of all elements in an array.
     */
    @Test
    public void testGetSumItems() {
        Assert.assertEquals(15, programs.getSumItems(new int[]{1,2,3,4,5}));
        Assert.assertNotEquals(2, programs.getSumItems(new int[]{1,2,3}));
    }

    /***
     * Testing the conversion of a string.
     */
    @Test
    public void testConvertingString() {
        Assert.assertEquals("heLLO", programs.convertString("HEllo"));
        Assert.assertEquals("VeNkAtA.", programs.convertString("vEnKaTa."));
        Assert.assertNotEquals("venkata", programs.convertString("venkata"));
    }

    /***
     * Testing the hash map.
     */
    @Test
    public void testSortHashMap() {
        Map<Integer, String> hashMap = createHashMap();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Yash");
        map.put(2, "Venkata");
        map.put(3, "V");
        Assert.assertEquals(map, programs.sortHashMap(hashMap));
    }

    /***
     * Testing reverse of an array list.
     */
    @Test
    public void testReverseArrayList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> outputArrayList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        Assert.assertEquals(outputArrayList, programs.getReverse(integerArrayList));
    }

    public Map<Integer, String> createHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Venkata");
        hashMap.put(1, "Yash");
        hashMap.put(3, "V");
        return hashMap;
    }

}

