package HW18;
/*В поисковом поле ввести oculus
        Кликнуть иконку поиска
        Отсортировать результаты от дорогих к дешевым
        Проверить, что товар Oculus Quest 2 256 Gb присутствует в результатах выдачи*/

import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PriceUaTest extends UIBaseTest {
    @Test
    public void findProduct() {
        driver.get("https://price.ua/ua");
        String searchText = "oculus";
        String itemTitle = "Oculus Quest 2 256 Gb";
        WebElement searchField = driver.findElement(By.xpath("//input[@id='SearchForm_searchPhrase']"));
        searchField.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.className("btn-search"));
        searchButton.click();

        WebElement sortButton = driver.findElement(By.xpath("//a[@class='link ga_cat_sort hight-to-low']"));
        sortButton.click();

        WebElement foundElementTitle = driver.findElement(By.cssSelector("a[title^='Oculus Quest 2 256 Gb'"));
        Assert.assertTrue(foundElementTitle.isDisplayed(),itemTitle);




       /* List<WebElement> itemsTitles = driver.findElements(By.className("product-block type2"));
        for (WebElement itemsTitle : itemsTitles) {
            if (itemsTitle.getText().equals(itemTitle)) ;
            // Assert.assertTrue (itemsTitles.contains("Oculus Quest 2 256 Gb"))
            //System.out.println();

        }*/


    }
}
