import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

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
