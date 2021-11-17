package HW22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPageObject {

    WebDriver driver;

    By languageButton = By.className("bui-avatar__image");
    By englishLanguage = By.xpath("//div[@class='bui-inline-container__main'] [contains(text(),'English (UK)')]");
    By findPlaceToGo = By.id("ss");
    By checkIn = By.xpath("//div[@data-mode='checkin']");
    By chooseDateCheckin = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-17']//span[contains(text(),'17')]");
    By chooseDateCheckOut = By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-18']//span[contains(text(),'18')]");
    By searchButton = By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']//span[contains(text(),'Search')]");
    By inputType = By.xpath("//input[@placeholder='London']");
   // By rightDateCheckin = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Wednesday 17 November 2021')]");
   // By rightDateCheckout = By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Thursday 18 November 2021')]");
    By checkbox = By.xpath("//div[@data-testid='filters-group-label-content'] [contains(text(),'Superb: 9+')]");

    public BookingPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAndChangeLanguageButton(){
        driver.findElement(languageButton).click();
        driver.findElement(englishLanguage).click();
    }

    private void enterTextIntoSearchField(String place) {
        driver.findElement(searchField).sendKeys(searchText);
    }


    }






