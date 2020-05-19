package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class DashboardTest {
	
	WebDriver driver;
	@Test
	public void dashboardVerification() {
		// connect with BrowserFactory
				driver = BrowserFactory.launchBrowser();

				// create page factory to call the Page
				LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
				DashboardPage DashboardPage = PageFactory.initElements(driver, DashboardPage.class);
				// call the methods
				LoginPage.enteredUserName("techfiosdemo@gmail.com");
				LoginPage.enteredPassword("abc123");
				LoginPage.clickSigninButton();
				DashboardPage.dashboardTabVisibility();

		
	}

}
