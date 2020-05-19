package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void validusershouldbeabletologin() {
		// connect with BrowserFactory
		driver = BrowserFactory.launchBrowser();

		// create page factory to call the LoginPage
		LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
		
		// call the methods
		LoginPage.enteredUserName("techfiosdemo@gmail.com");
		LoginPage.enteredPassword("abc123");
		LoginPage.clickSigninButton();

	}

}
