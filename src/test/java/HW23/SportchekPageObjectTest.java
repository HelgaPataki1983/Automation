package HW23;

import HW23PO.SportchekPageObject;
import UITest.UIBaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SportchekPageObjectTest extends UIBaseTest {
    private String url = "https://www.sportchek.ca/categories/women/tops/hoodies/product/champion-womens-sportswear-powerblend-applique-hoodie-color-333261000_06-333261000.html#333261000%5Bcolor%5D=333261000_06";

    SportchekPageObject sportchekPageObject;

    @BeforeMethod
   public void preConditions() {
        driver.get(url);
   }

    @Test

    public void sportchekTest(){
        sportchekPageObject = new SportchekPageObject(driver);
        sportchekPageObject.selectColor();
        sportchekPageObject.selectSize();
        sportchekPageObject.selectNumberOfItem();
        sportchekPageObject.selectAddToCardButton();
        Assert.assertTrue(sportchekPageObject.modalWindow());
        sportchekPageObject.tipTheMice();
        Assert.assertEquals(sportchekPageObject.getNumberOfItem(), sportchekPageObject.getNumberOfCartItem());
        Assert.assertEquals(sportchekPageObject.getTitleOfItem(), sportchekPageObject.getCartTitleOfItem());

    }
}
