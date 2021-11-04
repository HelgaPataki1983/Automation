package HW18;
/*В поисковом поле ввести oculus

        Кликнуть иконку поиска

        Отсортировать результаты от дорогих к дешевым

        Проверить, что товар Oculus Quest 2 256 Gb присутствует в результатах выдачи*/

import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PriceUaTest extends UIBaseTest {
    @Test
    public void findProduct(){
        driver.get("https://price.ua/ua");
        String searchText =  "oculus";
        WebElement searchField = driver.findElement(By.xpath("//input[@id='SearchForm_searchPhrase']"));
        searchField.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.className("btn-search"));
        searchButton.click();

        WebElement sortButton = driver.findElement(By.xpath("//a[@class='link ga_cat_sort hight-to-low']"));
        sortButton.click();

    }
}
