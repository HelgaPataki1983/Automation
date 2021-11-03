package HW17tests;
import UITest.UIBaseTest;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.awt.*;

public class IntertopTest extends UIBaseTest {

    @Test
    public void positivTest() {
        driver.get("https://intertop.ua/");
        Assert.assertTrue(driver.getTitle().contains("INTERTOP"));
    }
    @Test
    public void negativeTest() {
        driver.get("https://intertop.ua/");
        Assert.assertFalse(driver.getTitle().contains("IINTERTOP"));
    }
    @Test
    public void negativeTest2() {
        driver.get("https://intertop.ua/");
        String intertopTab = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://java-online.ru/blog-junit.xhtml");
        String javaonlineTab = driver.getCurrentUrl();
        Assert.assertNotEquals(intertopTab,javaonlineTab);
    }
    @Test
    public void positiveTest2() {
        driver.get("https://intertop.ua/");
        String intertopTab = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://intertop.ua/");
        String intertopTab1 = driver.getCurrentUrl();
        Assert.assertEquals(intertopTab,intertopTab1);
    }
}


