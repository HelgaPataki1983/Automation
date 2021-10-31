package HW16Tests;
import HW16.DigitReversed;
import TestngDemoTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitReversedTest extends BaseTest {
    DigitReversed digitReversed = new DigitReversed();
    String reverse ;


    @Test
    public void testReverse() {
        System.out.println("Positive testReverse test case");
        reverse = "12345";
        String expectedResult = "54321";
        String actualResult = digitReversed.digitsReverse(reverse);
       Assert.assertEquals(actualResult, expectedResult, "Actual result match expected");
    }
    @Test
    public void testReverse1() {
        System.out.println("Positive testReverse test case");
        reverse = "Olga";
        String expectedResult = "aglO";
        String actualResult = digitReversed.digitsReverse(reverse);
        Assert.assertEquals(actualResult, expectedResult, "Actual result match expected");
    }
    @Test
    public void testReverse2() {
        System.out.println("Negative testReverse test case");
        reverse = "";
        String expectedResult = "aglO";
        String actualResult = digitReversed.digitsReverse(reverse);
        Assert.assertNotEquals(actualResult, expectedResult, "Actual result match expected");
    }
}
