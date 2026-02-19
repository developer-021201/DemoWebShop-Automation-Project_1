package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;
    By genderMale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPwd = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerUser(String fn, String ln, String mail, String pwd) {
        driver.findElement(genderMale).click();
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmPwd).sendKeys(pwd);
        driver.findElement(registerBtn).click();
    }
}
