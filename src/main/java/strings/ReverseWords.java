package strings;

public class ReverseWords {


    // Function to reverse each word in a sentence
    public String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }

        // Join the reversed words back into a sentence
        return String.join(" ", words);
    }

    // Function to reverse a string
    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}

