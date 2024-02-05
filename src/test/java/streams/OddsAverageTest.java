package streams;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OddsAverageTest {

    @Test
    public void testAverageOfAllOdds() {
        Assert.assertEquals(25.0, OddsAverage.getAverageOfAllOdds(List.of(2, 1, 7)), 0.001);
    }
}
