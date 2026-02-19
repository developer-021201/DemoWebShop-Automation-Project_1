package test;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void login() {

        // Click Login link first
        driver.findElement(By.linkText("Log in")).click();

        LoginPage lp = new LoginPage(driver);
        lp.loginUser("keval@mail.com", "Fail123");
    }
}
