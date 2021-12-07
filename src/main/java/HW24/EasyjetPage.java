package HW24;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class EasyjetPage {
    private String fromWhere = "Berlin";
    private String toWhere = "London";
    private String day = "15";

    private SelenideElement acceptCookies = $(By.id("ensCloseBanner"));
    private SelenideElement enterFromWere = $(By.name("origin"));
    private SelenideElement chooseBerlin = $(By.className("ui-corner-all"));
    private SelenideElement enterToWere = $(By.name("destination"));
    private SelenideElement chooseLondon = $(By.id("ui-id-1115"));
    private SelenideElement departing =$(By.className("calendar"));
    private SelenideElement dayNumberFrom =$(By.className("day-number"));
    private SelenideElement returning =$(By.className("date-picker-button button-reset"));
    private SelenideElement dayNumberTo =$(By.className("day-number"));
    private SelenideElement addAdults = $(By.className("quantity-button-add"));
    private SelenideElement clickSearch = $(By.className("ej-button rounded-corners arrow-button search-submit"));
    //private SelenideElement returning =$();

      public EasyjetPage open() {
          Selenide.open("/");
          return this;
      }
      public EasyjetPage closeCookies(){
          acceptCookies.click();
          return this;
      }
      public EasyjetPage enterPlaceFromWhere(){
          enterFromWere.click();
          enterFromWere.setValue(fromWhere).click();
          chooseBerlin.click();
          return this;
      }

    public EasyjetPage enterPlaceToWhere(){
        enterToWere.click();
        enterToWere.setValue(toWhere).click();
       // chooseLondon.click();
        return this;
    }
    public EasyjetPage enterDeparting(){
        departing.click();
        return this;
    }
    public EasyjetPage enterReturning(){
        returning.click();
        return this;
    }
    public EasyjetPage enterDateFrom(){
          dayNumberFrom.click();
          return this;
    }
    public EasyjetPage enterDateTo(){
        dayNumberTo.click();
        return this;
    }
    public EasyjetPage addAdults(){
          addAdults.click();
          return this;
    }
    public EasyjetPage clickSearch(){
          clickSearch.click();
          return this;
    }


}
