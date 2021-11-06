
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
import org.testng.annotations.Test;

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
        findPlaceToGo.sendKeys(place, Keys.ENTER);

        WebElement checkIn = driver.findElement(By.className("sb-date-field__display"));
        checkIn.click();
    }

}

