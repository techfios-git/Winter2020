package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashBoardTest {

	WebDriver driver;

	@Test
	public void dashBoardTest() {
		driver = BrowserFactory.launchBrowser();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUsername("techfiosdemo@gmail.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();

		DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);

	}
}
