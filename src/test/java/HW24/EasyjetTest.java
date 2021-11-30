package HW24;
/*Navigate to airline site https://www.easyjet.com/en
        2) Input "Berlin" in FROM field
        3) Input "London" in TO field
        4) Choose dates: 15-19 Dec
        5) Choose 2 adults
        6) Click search
        7) Verify that there are 2 blocks: Berlin-London, London-Berlin
        8) Verify dates are 15 Dec and 19 Dec accordingly*/

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class EasyjetTest {
    EasyjetPageObject easyjetPageObject = new EasyjetPageObject();

    private String https = "https://www.easyjet.com/en";

    @Test
    public void selenideTest(){
    Selenide.open(https);
    easyjetPageObject.closeCookies();
        easyjetPageObject.enterPlaceFromWhere();
        easyjetPageObject.SetValue();
    }


}
