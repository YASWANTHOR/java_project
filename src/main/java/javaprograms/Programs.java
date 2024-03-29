package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Programs {

    public int reverseNumber(int number) {
        int reverse = 0;
        while(number > 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }

    /***
     * Palindrome of a number
     */
    public boolean isPalindrome(int number) {
        return reverseNumber(number) == number;
    }

    /***
     * Swapping two numbers without using the third variable
     */
    public int[] swappingWithOutThird(int numberOne, int numberTwo) {
        numberOne = numberOne * numberTwo;
        numberTwo = numberOne / numberTwo;
        numberOne /= numberTwo;
        return new int[]{numberOne, numberTwo};
    }

    /***
     * Factorial of a number
     */

    public int getFactorial(int number) {
        int factorialNumber = 1;
        for(int i = number; i >= 1; i--) {
            factorialNumber *= i;
        }
        if(number < 0)
            return -1;
        return factorialNumber;
    }

    /***
     * Repeating characters of a string.
     */

    public ArrayList<Character> getRepeatedCharacters(String input) {
        ArrayList<Character> characterArrayList = new ArrayList<>();
        char[] charArray = input.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char c : charArray) {
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            } else characterIntegerHashMap.put(c, 1);
        }
        for(int i = 0; i < characterIntegerHashMap.size(); i++) {
            if(characterIntegerHashMap.get(charArray[i]) > 1)
                characterArrayList.add(charArray[i]);
        }
        return characterArrayList;
    }

    /***
     * Getting the count of unique words in a string.
     */

    public int getCountUniqueWords(String input) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        if(input.isEmpty())
            return 0;
        String[] stringArray = input.split(" ");
        for(int i = 0; i < stringArray.length; i++) {
            if(stringIntegerHashMap.containsKey(stringArray[i])) {
                stringIntegerHashMap.put(stringArray[i], stringIntegerHashMap.get(stringArray[i]) + 1);
            }
            else stringIntegerHashMap.put(stringArray[i], 1);
        }
        int count = 0;
        for(int i = 0; i < stringIntegerHashMap.size(); i++) {
            if(stringIntegerHashMap.get(stringArray[i]) == 1)
                count++;
        }
        return count;
    }

    /***
     * Check whether one string is rotated of another.
     * @param inputOne
     * @param inputTwo
     * @return
     */
    public boolean isStringRotated(String inputOne, String inputTwo) {
        String output = inputOne + inputOne;
        return output.contains(inputTwo);
    }


    /***
     * Sorted Hash map
     * @param hashMap
     * @return
     */
    public Map<Integer, String> sortHashMap(Map<Integer, String> hashMap) {
        return new TreeMap<>(hashMap);
    }


    /***
     * Reversing the array list using loop.
     * @param integerArrayList
     * @return
     */
    public ArrayList<Integer> getReverse(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> outputArrayList = new ArrayList<>();
        for(int i = integerArrayList.size() - 1; i >= 0; i--)
            outputArrayList.add(integerArrayList.get(i));

        return outputArrayList;
    }


    /***
     * Print sum of all the items of the array.
     * Time complexity will be O(n).
     * @param arr
     * @return
     */
    public int getSumItems(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    /***
     * Replace the lower case characters to upper case and vice versa.
     * Time complexity will be O(n).
     * @param input
     * @return
     */
    public String convertString(String input) {
        String outputString = "";
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                outputString += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c))
                outputString += Character.toLowerCase(c);
            else
                outputString += c;

        }
        return outputString.toString();
    }

}

