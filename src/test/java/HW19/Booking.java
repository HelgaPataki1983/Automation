
package HW19;

/*Заходим на сайт https://www.booking.com
        2. Меняем язык на английский
        3.Вводим пункт назначения, к примеру, London
        4. Выбираем дату заезда и дату выезда, к примеру: 12 December 2021 - 15 December 2021. Ваш тест должен автоматом скролить календарь до тех пор, пока не будет найдена Ваша искомая дата заезда. Такая же ситуация с датой выезда.
        5. Нажимаем кнопку Search
        6. После того, как открылся список отелей, проверить, что пункт назначения и даты указаны верно в левой панели Search
        7. В фильтрах в блоке Review Score выбираем Wonderful: 9+
        8.Делаем проверку, что для всех отелей, отображенных на странице, рейтинг равен 9 и выше*/

import UITest.UIBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Booking extends UIBaseTest {

    @Test
    public void bookHotel(){
        driver.get("https://www.booking.com");
        String place = "London";
        WebElement languageButton = driver.findElement(By.className("bui-avatar__image"));
        languageButton.click();

        WebElement englishLanguage = driver.findElement(By.xpath("//div[@class='bui-inline-container__main'] [contains(text(),'English (UK)')]"));
        englishLanguage.click();

        WebElement findPlaceToGo = driver.findElement(By.id("ss"));
        findPlaceToGo.sendKeys(place);

        WebElement checkIn = driver.findElement(By.xpath("//div[@data-mode='checkin']"));
        checkIn.click();

        WebElement chooseDateCheckin = driver.findElement(By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-17']//span[contains(text(),'17')]"));
        chooseDateCheckin.click();

        WebElement chooseDateCheckOut = driver.findElement(By.xpath("//div[@class='bui-calendar__wrapper']//td[@data-date='2021-11-18']//span[contains(text(),'18')]"));
        chooseDateCheckOut.click();

        WebElement searchButton = driver.findElement(By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']//span[contains(text(),'Search')]"));
        searchButton.click();

        WebElement inputType = driver.findElement(By.xpath("//input[@placeholder='London']"));
        Assert.assertTrue(inputType.isDisplayed());

        WebElement rightDateCheckin = driver.findElement(By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Wednesday 17 November 2021')]"));
        Assert.assertTrue(rightDateCheckin.isDisplayed());

        WebElement rightDateCheckout = driver.findElement(By.xpath("//div[@class='sb-date-field__display'] [contains(text(),'Thursday 18 November 2021')]"));
        Assert.assertTrue(rightDateCheckout.isDisplayed());

        WebElement checkbox = driver.findElement(By.xpath("//div[@data-testid='filters-group-label-content'] [contains(text(),'Superb: 9+')]"));
        checkbox.click();

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




