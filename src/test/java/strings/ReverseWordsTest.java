package strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {
    @Test
    public void testReverseWordsSuccess(){
        ReverseWords revWords = new ReverseWords();
        String output = revWords.reverseWords("apple is on table");
        Assert.assertNotNull(output);
        Assert.assertEquals("elppa si no elbat",output);
    }
    @Test
    public void testReverseWordsFailure(){
        ReverseWords revWords = new ReverseWords();
        String output = revWords.reverseWords("string is immutable");
        Assert.assertNotNull(output);
        Assert.assertNotEquals("gittrs si elbatmmui",output);
    }

}
