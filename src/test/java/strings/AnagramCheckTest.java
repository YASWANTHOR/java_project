package strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramCheckTest {
    @Test
    public void testAnagramSuccess() {
        AnagramCheck anagramCheck = new AnagramCheck();
        boolean output = anagramCheck.areAnagrams("race", "care");
        Assert.assertTrue(output);
   }
   @Test
   public void testAnagramFailure() {
        AnagramCheck anagramCheck = new AnagramCheck();
        boolean output = anagramCheck.areAnagrams("pen", "ink");
        Assert.assertFalse(output);
   }

}

