package HW22PO;

import fe.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookingSearchResultPage extends BasePage {
    By checkPlaceToGo = By.xpath("//input[@placeholder='London']");
    By rightDateCheckin = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Tuesday 23 November 2021')]");
    By rightDateCheckout = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Sunday 28 November 2021')]");
    By checkbox = By.xpath("//div[@data-testid='filters-group-label-content'] [contains(text(),'Superb: 9+')]");
    By SuperbScoreHotels = By.cssSelector("[data-testid=review-score] div[aria-label]");
    By CookiePage = By.className("ot-sdk-container");
    By AcceptButton = By.id("onetrust-accept-btn-handler");

    public BookingSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public BookingSearchResultPage GetNameOfCity() {
        driver.findElement(checkPlaceToGo);
        return this;
    }

    public String getDestinationFieldAccessibleName() {
        return driver.findElement(checkPlaceToGo).getAccessibleName();
    }

    public Boolean rightDateCheckinAndCheckout() {
        driver.findElement(rightDateCheckin);
        driver.findElement(rightDateCheckout);
        return true;
    }

    public BookingSearchResultPage checkbox() {
        driver.findElement(checkbox).click();
        return this;
    }

    public void acceptCookie() {
        List<WebElement> cookie = driver.findElements(CookiePage);
        for (WebElement cookies : cookie) {
            if (cookie.size() > 0) {
                driver.findElement(AcceptButton).click();
            } else { // не поняла что я хочу получить если окна с принятием каков нет...
            }
        }
    }

    public Boolean getSuperbScoreHotels() {
        List<WebElement> hotelScore = driver.findElements(SuperbScoreHotels);
        double minimumScore = 9.0;
        for (WebElement hotelScores : hotelScore) {
            double actualScore = Double.parseDouble(hotelScores.getText());
            System.out.println(hotelScores.getText());
            if (actualScore <minimumScore) {
                return false;

            }

        }
        return true;

    }}
