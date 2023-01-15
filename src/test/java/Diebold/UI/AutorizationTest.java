package Diebold.UI;

import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class AutorizationTest extends UIBaseTest {
    private String validLogin = "99";
    private String validPassword = "99";
    private String productPageUrl = "https://retail.sit-weu.fcx.nextgen.dieboldnixdorf.com/pointOfSales";

    @Test
    public void Login() {
        driver.get("https://sit-weu.fcx.nextgen.dieboldnixdorf.com/Account/Login?");
        WebElement loginField = driver.findElement(By.name("Username"));
        loginField.sendKeys(validLogin);

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys(validPassword);

        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();

        WebElement loginButton1 = driver.findElement(By.className("login-button"));
        loginButton1.click();

        Assert.assertEquals(driver.getCurrentUrl(), productPageUrl);

    }
}
