package HW22;
import HW22PO.GoogleMainPageObject ;
import HW22PO.GoogleSearchResultPage ;
import UITest.UIBaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglePageObjectTest extends UIBaseTest{
    private String url = "https://www.google.com/";
    private String searchInput = "iphone kyiv buy";
    private String expectedWebsite = "allo.ua";

    GoogleMainPageObject googleMainPage;
    GoogleSearchResultPage googleSearchResultPage;

    @BeforeMethod
    public void preConditions() {
        driver.get(url);
    }

    @Test
    public void iPhoneSearchOnFirstFiveGooglePages() {

        googleMainPage = new GoogleMainPageObject(driver);
        googleSearchResultPage = new GoogleSearchResultPage(driver);

        googleMainPage.performSearch(searchInput);
        Assert.assertEquals(googleSearchResultPage.getSearchFieldText(), searchInput);
        Assert.assertTrue(googleSearchResultPage.isSiteNameFoundOnFirst5Pages(expectedWebsite),
                "ALLO.UA was not found on first 5 pages");
    }
}


