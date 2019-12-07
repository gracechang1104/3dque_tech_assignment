import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import reverse_string.StringManager;

public class UnitTests {

    private StringManager newStringManager;

    @Before
    public void setUpTest()
    {
        this.newStringManager = new StringManager();
    }

    @Test
    public void testEmptyString()
    {
        String returnString = newStringManager.reverseString("");
        Assert.assertEquals("", returnString);

    }

    @Test
    public void testOneChar()
    {
        String returnString = newStringManager.reverseString("a");
        Assert.assertEquals("a", returnString);

    }

    @Test
    public void testString()
    {
        String returnString = newStringManager.reverseString("orangepeel");
        Assert.assertEquals("leepegnaro", returnString);

    }

    @Test
    public void testEvenString()
    {
        String returnString = newStringManager.reverseString("same");
        Assert.assertEquals("emas", returnString);

    }

    @Test
    public void testOddString()
    {
        String returnString = newStringManager.reverseString("pizza");
        Assert.assertEquals("azzip", returnString);

    }

    @Test
    public void testStrangeChars()
    {
        String returnString = newStringManager.reverseString("hello-world");
        Assert.assertEquals("dlrow-olleh", returnString);
    }

    @Test
    public void testMoreStrangeChars()
    {
        String returnString = newStringManager.reverseString("1+2=3");
        Assert.assertEquals("3=2+1", returnString);

    }

    @Test
    public void testSemicolon()
    {
        String returnString = newStringManager.reverseString("hello;world");
        Assert.assertEquals("dlrow;olleh", returnString);
    }


}
