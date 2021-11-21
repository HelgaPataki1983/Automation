package HW22PO;

import fe.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleMainPageObject extends BasePage {

    By searchField = By.cssSelector("input[name='q']");
    By searchButton = By.cssSelector("input[type='submit']");


    public GoogleMainPageObject(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchText) {
        enterTextIntoSearchField(searchText);
        clickSearchButton();
    }

    public void enterTextIntoSearchField(String searchText) {
        driver.findElement(searchField).sendKeys(searchText);

    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();

    }
}
