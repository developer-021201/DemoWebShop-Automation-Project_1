package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By email = By.id("Email");
    By password = By.id("Password");
    By loginLink = By.linkText("Log in");
    By loginBtn = By.cssSelector("input.button-1.login-button");
    


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginUser(String mail, String pwd){
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }
}
