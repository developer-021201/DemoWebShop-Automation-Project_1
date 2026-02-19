package test;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

	@Test
	public void register() {

	    driver.findElement(By.linkText("Register")).click();  // IMPORTANT LINE

	    RegisterPage rp = new RegisterPage(driver);
	    rp.registerUser("Keval", "Vithlani",
	            "keval" + System.currentTimeMillis() + "@mail.com",
	            "Fail123");
	}
}