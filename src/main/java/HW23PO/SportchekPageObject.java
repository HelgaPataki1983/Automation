package HW23PO;
/*1. Открываем страницу продукта по прямой ссылке https://www.sportchek.ca/categories/women/tops/hoodies/product/champion-womens-sportswear-powerblend-applique-hoodie-color-333261000_06-333261000.html#333261000%5Bcolor%5D=333261000_06
        2. Выбираем цвет (любой достеупный. Предусмотреть проверку, что если цвет уже выбран, то не выбираем его)
        3. Выбираем Size (любой доступный).
        4. Выбираем количество товара
        5. Кликаем кнопку Add to cart
        6. Проверяем сообщение, что This Item has been added to cart
        7. Подводим курсор к иконке с корзиной и проверяем, что Ttile товара и его QTY соответствует тому, что Вы выбирали*/

import fe.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SportchekPageObject extends BasePage {

    public SportchekPageObject(WebDriver driver) {
        super(driver);
    }
   // String message = "This Item has been added to cart";

    @FindBy(css = "a.product-detail__color-option")
    private WebElement color;

    @FindBy(xpath = "//span[@class='option-tiles__item-title'] [contains(text(),'XS')]")
    private WebElement activeSize;

    @FindBy(css = "increase quantity")
    private WebElement increaseQuantity;

    @FindBy(css = "product-detail__add-cart wait-module")
    private WebElement addToCardButton;

    @FindBy(css = "a.header-cart__trigger drawer-ui__toggle")
    private WebElement cartIcon;

    @FindBy(css = "header-cart__container")
    private WebElement modalWindowWithMessage;

    @FindBy(id = "product-detail__quantity-input number-spin-input")
    private WebElement numberOfItem;

    @FindBy(xpath = "//span[@class='header-cart__count']")
    private WebElement numberOfCartItem;

    @FindBy(css = "global-page-header__title")
    private WebElement titleOfItem;

    @FindBy(xpath = "//div[@class='cart-item__title']")
    private WebElement cartTitleOfItem;

    public void selectColor(){
    color.click();
    }

    public void selectSize(){
    activeSize.click();
    }

    public void selectNumberOfItem() {increaseQuantity.click();}

    public void selectAddToCardButton() {addToCardButton.click();}

    public boolean modalWindow(){
        return (modalWindowWithMessage).isDisplayed();
    }

    public void tipTheMice() {
        actions.moveToElement(cartIcon);}

    public String getNumberOfItem() {
        return (numberOfItem).getText();
    }
    public String getNumberOfCartItem() {
        return (numberOfCartItem).getText();
    }
    public String getTitleOfItem() {
        return (titleOfItem).getText();
    }
    public String getCartTitleOfItem() {
        return (cartTitleOfItem).getText();
    }

}







