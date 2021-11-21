package HW22;

import HW22PO.BookingMainPageObject;
import HW22PO.BookingSearchResultPage;
import UITest.UIBaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingPageObjectTest extends UIBaseTest {
    private String destination = "London";
    private String url = "https://booking.com/";

    BookingMainPageObject bookingMainPageObjectPageObject;
    BookingSearchResultPage bookingSearchResultPage;

    @BeforeMethod
    public void preConditions() {
        driver.get(url);
    }

    @Test

    public void bookingHotelsScoreTest() {
        bookingMainPageObjectPageObject = new BookingMainPageObject(driver);
        bookingSearchResultPage = new BookingSearchResultPage(driver);
        bookingMainPageObjectPageObject.clickAndChangeLanguageButton();
        bookingMainPageObjectPageObject.acceptCookie();
        bookingMainPageObjectPageObject.enterTextIntoSearchField();
        bookingMainPageObjectPageObject.findDateCheckin();
        bookingMainPageObjectPageObject.findDateCheckOut();
        bookingMainPageObjectPageObject.searchButton();
        bookingSearchResultPage.checkbox();
        bookingSearchResultPage.rightDateCheckinAndCheckout();
        bookingSearchResultPage.acceptCookie();
        bookingSearchResultPage.checkbox();
        Assert.assertTrue(bookingSearchResultPage.getSuperbScoreHotels());
        Assert.assertTrue(bookingSearchResultPage.getDestinationFieldAccessibleName().contains(destination));
        Assert.assertTrue(bookingSearchResultPage.rightDateCheckinAndCheckout());


    }


       }





