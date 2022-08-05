import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MainClassTest {

    @Test
    public void testGetClassString(){
        MainClass mainClassObject = new MainClass();
        String actualString = mainClassObject.getClassString();
        String expectedFirstSubstring = "Hello";
        String expectedSecondSubstring = "hello";

        Assert.assertTrue("The string '" + actualString + "' does not contains 'Hello' or 'hello'",
                actualString.contains(expectedFirstSubstring) || actualString.contains(expectedSecondSubstring));
    }

    @Test
    public void testGetLocalNumber(){
        int expectedLocalNumber = 14;
        MainClass mainClass = new MainClass();
        Assert.assertEquals("Local number is incorrect.", mainClass.getLocalNumber(), expectedLocalNumber);
    }

    @Test
    public void testGetClassNumber(){
        MainClass mainClassObject = new MainClass();

        Integer comparedNumber = 45;
        Integer actualNumber = mainClassObject.getClassNumber();

        Assert.assertEquals("Class number " + actualNumber + " is not greater than " + comparedNumber,
                            actualNumber.compareTo(comparedNumber), 1);
    }
}
