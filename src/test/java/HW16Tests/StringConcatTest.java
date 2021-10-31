package HW16Tests;
import HW16.StringConcat;
import TestngDemoTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringConcatTest extends BaseTest {
    StringConcat stringConcat = new StringConcat();
    String firstString;
    String secondString;
    String string = "";

    @Test
    public void testReverse() {
        System.out.println("Positiv testReverse test case");
        String firstString = "Bogdan";
        String secondString = "Vasylovich";
        String expectedResult = "Hello,Bogdan Vasylovich!";
        String actualResult = stringConcat.printPersonalGreeting(firstString, secondString);
        Assert.assertEquals( actualResult, expectedResult,"Actual result match expected");
    }
@Test
    public void testReverse1() {
        System.out.println("Negative testReverse test case");
        String firstString = "Bogdan";
        String secondString = "Vasylovich";
        String expectedResult = "Hello,Bogdan Vasylovich!";
        String actualResult = stringConcat.printPersonalGreeting(firstString, secondString);
        Assert.assertFalse(firstString + secondString + "!" == "Hello,Bogdan Vasylovich!", "Actual result dont  match expected");
    }



}
