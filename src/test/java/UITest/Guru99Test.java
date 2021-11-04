package UITest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Test extends UIBaseTest {
    String url = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    String validLogin = "1303";
    String validPassword = "Guru99";
    String invalidPassword = "123";
    String invalidLogin = "130303";
    String alertText = "User or Password is not valid";
    String emptyLogin = "";
    String emptyPassword = "";

    @Test
    public void loginWithValidCredentials() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(validLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(validPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

        WebElement pageTitle = driver.findElement(By.className("barone"));
        String expectedTitle = "Guru99 Bank";

        Assert.assertEquals(pageTitle.getText(), expectedTitle);

        WebElement logoutButton = driver.findElement(By.cssSelector("[href^=Logout]"));
        logoutButton.click();

        String alertText = "You Have Succesfully Logged Out!!";
        String partialAlertTest = "Logged Out";

        Assert.assertEquals(driver.switchTo().alert().getText(), alertText);
        Assert.assertTrue(driver.switchTo().alert().getText().contains(partialAlertTest));

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void loginWithInvalidPassword() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(validLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(invalidPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

        String alertText = "User or Password is not valid";

        Assert.assertEquals(driver.switchTo().alert().getText(), alertText);

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void loginWithInvalidLogin() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(invalidLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(invalidPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

        Assert.assertEquals(driver.switchTo().alert().getText(), alertText);

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginWithInvalidCredentials() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(invalidLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(invalidPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();

        Assert.assertEquals(driver.switchTo().alert().getText(), alertText);

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginWithEmptyLogin() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(emptyLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(validPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();
        Assert.assertEquals(driver.switchTo().alert().getText(), alertText);

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
    @Test
    public void loginWithEmptyPassword() {
        driver.get(url);

        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys(validLogin);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(emptyPassword);

        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();
       Assert.assertEquals(driver.switchTo().alert().getText(), alertText);

        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.getCurrentUrl(), url); // падает тест , не пойму почему, на 142 строке
    }

}
