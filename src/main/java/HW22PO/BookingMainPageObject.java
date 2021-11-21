package HW22PO;
import fe.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BookingMainPageObject extends BasePage {

    By languageButton = By.className("bui-avatar__image");
    By englishLanguage = By.xpath("//div[@class='bui-inline-container__main'] [contains(text(),'English (UK)')]");
    By findPlaceToGo = By.id("ss");
    By CookiePage = By.className("ot-sdk-container");
    By AcceptButton = By.id("onetrust-accept-btn-handler");
    By checkIn = By.xpath("//div[@data-mode='checkin']");
    By chooseDateCheckin = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-23']//span[contains(text(),'23')]");
    By chooseDateCheckOut = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-28']//span[contains(text(),'28')]");
    By searchButton = By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']//span[contains(text(),'Search')]");

    private String destination = "London";
    private Object BookingSearchResultPage;

    public BookingMainPageObject(WebDriver driver) {
        super(driver);
    }

    public BookingMainPageObject clickAndChangeLanguageButton() {
        driver.findElement(languageButton).click();
        driver.findElement(englishLanguage).click();
        return this;
    }

    public BookingMainPageObject enterTextIntoSearchField() {
        driver.findElement(findPlaceToGo).sendKeys(destination);
        return this;
    }


    public BookingMainPageObject findDateCheckin() {
        driver.findElement(checkIn).click();
        driver.findElement(chooseDateCheckin).click();
        return this;
    }

    public BookingMainPageObject findDateCheckOut() {
        driver.findElement(chooseDateCheckOut).click();
        return this;
    }


    public BookingMainPageObject searchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

    public void acceptCookie() {
        List<WebElement> cookie = driver.findElements(CookiePage);
        for (WebElement cookies : cookie) {
            if (cookie.size() > 0) {
                driver.findElement(AcceptButton).click();
            } else { // не поняла что я хочу получить если окна с принятием куков нет...
            }
        }
    }
}

