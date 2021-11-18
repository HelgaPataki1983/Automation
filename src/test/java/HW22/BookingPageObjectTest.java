package HW22;


import HW22PO.BookingPageObject;
import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BookingPageObjectTest extends UIBaseTest {
    String destination = "London";
    String url = "https://booking.com/";

    BookingPageObject bookingPageObject;

    @Test

    public void bookingHotelsScoreTest() {
        bookingPageObject = new BookingPageObject(driver);
        bookingPageObject.clickAndChangeLanguageButton();
        bookingPageObject.enterTextIntoSearchField();
        bookingPageObject.findDateCheckinAndCheckOut();
        bookingPageObject.searchButton();
        bookingPageObject.inputType();
        bookingPageObject.rightDateCheckinAndCheckout();
        bookingPageObject.checkbox();
        bookingPageObject.checkOnlySuperbScoreHotels();
        Assert.assertTrue(bookingPageObject.inputType().isDisplayed());  // ругается на isDisplayed() - не видит метода
        Assert.assertTrue(bookingPageObject.rightDateCheckinAndCheckout().isDisplayed());//ругается на isDisplayed() - не видит метода


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
