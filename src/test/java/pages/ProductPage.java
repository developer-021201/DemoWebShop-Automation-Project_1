package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;
    By addToCartBtn = By.cssSelector("input[value='Add to cart']");
    By computersTab = By.linkText("Computers");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToProduct() {
        driver.findElement(computersTab).click();
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Build your own expensive computer")).click();
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }
}
