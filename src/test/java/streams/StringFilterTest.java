package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

public class StringFilterTest {
    StringFilter stringFilter = new StringFilter();
    @Test
    public void testStrings() {
        List<String> stringList = List.of("Yash", "Venkata", "Vandavasi");
        Predicate<String> isStartsWithA = string -> string.startsWith("Y");
        Assert.assertEquals(List.of("Yash"), stringFilter.getListWithA(stringList, isStartsWithA));
    }
}
