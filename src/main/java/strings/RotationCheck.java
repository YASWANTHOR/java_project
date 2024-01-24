package strings;

public class RotationCheck {


    // Function to check if one string is a rotation of another
    public boolean isRotation(String str1, String str2) {
        // Check if the lengths are equal and not zero
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}

