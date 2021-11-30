package HW24;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class EasyjetPage {
    private String fromWhere = "Berlin";
    private String toWhere = "London";

    private SelenideElement acceptCookies = $(By.id("ensCloseBanner"));
    // private SelenideElement enterFromWere = $("ej-input origin ui-autocomplete-input");
    private SelenideElement enterFromWere = $x("//div[@class='input-wrapper ui-widget']");
    private SelenideElement enterToWere = $("input-wrapper ui-widget");
    /*private SelenideElement departing =$x("#search-results)
    private SelenideElement returning =$();
*/
      public EasyjetPage open() {
          Selenide.open("/");
          return this;
      }
      public EasyjetPage closeCookies(){
          acceptCookies.click();
          return this;
      }
      /*public EasyjetPageObject enterPlaceFromWhere(){
          enterFromWere.click();
          enterFromWere.setValue(fromWhere).click();
          return this;
      }*/

    public EasyjetPage enterPlaceToWhere() {
        enterToWere.click();
        enterToWere.setValue(toWhere).click();
        return this;
    }
    public EasyjetPage enterPlaceFromWhere() {
        enterFromWere.click();
        return this;
    }

        public EasyjetPage SetValue() {
            enterFromWere.setValue(fromWhere).click();
            return this;

        }

    //$x("//div[@class='input-wrapper ui-widget']")
}
