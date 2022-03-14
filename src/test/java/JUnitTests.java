import org.junit.Assert;
import org.junit.Test;

public class JUnitTests {
    public JUnitTests() {
    }

    @Test
    public void testIfNameIsJason() {
        String expected = "Justin";
        String actual = "Justin";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0D;
        Double discount = 4.5D;
        Assert.assertEquals(5.0D, price - discount, 0.5D);
        Assert.assertNotEquals(4.2D, price - discount, 0.5D);
    }
}




































