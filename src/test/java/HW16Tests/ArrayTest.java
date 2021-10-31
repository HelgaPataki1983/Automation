package HW16Tests;

import HW16.Array;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayTest {
    Array array;
    int[] testArray;

    @BeforeClass
    public void justBeforeTest() {
        System.out.println("I start test suit");
        array = new Array();
    }

    @Test
    public void testAverOfArray() {
        System.out.println("Positive testAverOfArray test case");
        testArray = new int[]{3, 5, 5, 5};
        float expectedResult = 4;
        float actualResult = array.averOfArray(testArray);
        Assert.assertTrue((3+5+5+5)/4==4, "Actual result match expected");
    }

    @Test
    public void testAverOfArray1() {
        System.out.println("Positive testAverOfArray test case with 0");
        testArray = new int[]{0, 0, 0, 0};
        float expectedResult = 0;
        float actualResult = array.averOfArray(testArray);
        Assert.assertEquals(actualResult, expectedResult, "Actual result match expected");
    }

    @Test
    public void testAverOfArray2() {
        System.out.println("Negative testAverOfArray test case");
        testArray = new int[]{3, 5, 5, 5};
        float expectedResult = 2;
        float actualResult = array.averOfArray(testArray);
                Assert.assertNotEquals(actualResult, expectedResult, "Actual result match expected");
    }

}

