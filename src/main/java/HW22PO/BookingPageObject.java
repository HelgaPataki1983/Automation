package HW22PO;
import fe.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BookingPageObject {

    WebDriver driver;

    By languageButton = By.className("bui-avatar__image");
    By englishLanguage = By.xpath("//div[@class='bui-inline-container__main'] [contains(text(),'English (UK)')]");
    By findPlaceToGo = By.id("ss");
    By checkIn = By.xpath("//div[@data-mode='checkin']");
    By chooseDateCheckin = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-20']//span[contains(text(),'17')]");
    By chooseDateCheckOut = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-25']//span[contains(text(),'18')]");
    By searchButton = By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']//span[contains(text(),'Search')]");
    By inputType = By.xpath("//input[@placeholder='London']");
    By rightDateCheckin = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Wednesday 20 November 2021')]");
    By rightDateCheckout = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Thursday 25 November 2021')]");
    By checkbox = By.xpath("//div[@data-testid='filters-group-label-content'] [contains(text(),'Superb: 9+')]");

    String destination = "London";

    public BookingPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAndChangeLanguageButton() {
        driver.findElement(languageButton).click();
        driver.findElement(englishLanguage).click();
    }

    public void enterTextIntoSearchField() {
        driver.findElement(findPlaceToGo).sendKeys(destination);
    }

    public void findDateCheckinAndCheckOut() {
        driver.findElement(chooseDateCheckin).click();
        driver.findElement(chooseDateCheckOut).click();
    }

    public void searchButton() {
        driver.findElement(searchButton).click();
    }

    public void inputType() {
        driver.findElement(inputType).click();
    }

    public void rightDateCheckinAndCheckout() {
        driver.findElement(rightDateCheckin);
        driver.findElement(rightDateCheckout);

    }

    public void checkbox() {
        driver.findElement(checkbox);
    }

    public void checkOnlySuperbScoreHotels() {
        List<WebElement> hotelScore = driver.findElements(By.cssSelector("[data-testid=review-score] div[aria-label]"));
        double minimumScore = 9.0;
        for (WebElement hotelScores : hotelScore) {

            double actualScore = Double.parseDouble(hotelScores.getText());
            {
                Assert.assertTrue(actualScore >= minimumScore);
            }
        }


    }
}