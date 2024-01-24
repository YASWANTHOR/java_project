package strings;

import org.junit.Assert;
import org.junit.Test;

public class RotationCheckTest {
    @Test
    public void testRotationCheckSuccess() {
        RotationCheck rotationCheck = new RotationCheck();
        boolean output = rotationCheck.isRotation("Javaj2eeStrutsHibernate", "StrutsHibernateJavaj2ee");
        Assert.assertTrue(output);
    }
    @Test
    public void testRotationCheckFailure() {
        RotationCheck rotationCheck = new RotationCheck();
        boolean output = rotationCheck.isRotation("angulartypescripthtmlcss", "htmlscriptcssangulartypescript");
        Assert.assertFalse(output);
    }


}
