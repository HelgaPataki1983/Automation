package HW18;
/*Открыть сайт https://www.saucedemo.com/
        Залогиниться со стандартным юзером

        Получить список товаров на странице

        Проверить, что кол-во отображенных товаров соответствует ожидаемому*/
import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class SaucedemoTest extends UIBaseTest {

        private String validLogin = "standard_user";
        private String validPassword = "secret_sauce";
        private String productPageUrl = "https://www.saucedemo.com/inventory.html";
        private int productsNumber= 6;

        @Test
        public void Login() {
                driver.get("https://www.saucedemo.com/");

                WebElement loginField = driver.findElement(By.name("user-name"));
                loginField.sendKeys(validLogin);

                WebElement passwordField = driver.findElement(By.name("password"));
                passwordField.sendKeys(validPassword);

                WebElement loginButton = driver.findElement(By.name("login-button"));
                loginButton.click();

                Assert.assertEquals(driver.getCurrentUrl(), productPageUrl);

                List<WebElement> itemsTitles = driver.findElements(By.className("inventory_item"));
                Assert.assertEquals(itemsTitles.size(),productsNumber);




        }
 }
