package test;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addItemToCart() {
    
    // Login first
    driver.findElement(By.linkText("Log in")).click();
    LoginPage lp = new LoginPage(driver);
    lp.loginUser("keval@mail.com", "Fail123");
    
    //Add Product
    {
        ProductPage pp = new ProductPage(driver);
        pp.navigateToProduct();
        pp.addToCart();
    }
}
}