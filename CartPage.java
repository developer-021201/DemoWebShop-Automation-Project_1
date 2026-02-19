package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    By shoppingCartLink = By.linkText("Shopping cart");
    By quantityBox = By.cssSelector("input.qty-input");
    By updateBtn = By.name("updatecart");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(shoppingCartLink).click();
    }

    public void updateQuantity(String qty) {
        driver.findElement(quantityBox).clear();
        driver.findElement(quantityBox).sendKeys(qty);
        driver.findElement(updateBtn).click();
    }
}
