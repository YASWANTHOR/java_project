package strings;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelsCheckTest {
    @Test
    public void testCountVowelsSuccess(){
        CountVowels countVowels = new CountVowels();
        int output = countVowels.findingVowelCount("apple");
        Assert.assertNotNull(output);
        Assert.assertEquals(2,output);
    }
    @Test
    public void testCountVowelsFilure(){
        CountVowels countVowels = new CountVowels();
        int output = countVowels.findingVowelCount("fly");
        Assert.assertNotEquals(1,output);
    }
    @Test
    public void testCountVowelsNull(){
        CountVowels countVowels = new CountVowels();
        int output = countVowels.findingVowelCount("");
        Assert.assertEquals(0,output);
    }
}
