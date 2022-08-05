import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        int expectedLocalNumber = 14;
        MainClass mainClass = new MainClass();
        Assert.assertEquals("Local number is incorrect.", mainClass.getLocalNumber(), expectedLocalNumber);
    }
}
