package test;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void checkCart() {

        // Login first
        driver.findElement(By.linkText("Log in")).click();
        LoginPage lp = new LoginPage(driver);
        lp.loginUser("keval@mail.com", "Fail123");

        // Add product first
        ProductPage pp = new ProductPage(driver);
        pp.navigateToProduct();
        pp.addToCart();

        // Now open cart
        CartPage cp = new CartPage(driver); 
        cp.openCart();
        cp.updateQuantity("2");
    }
}
