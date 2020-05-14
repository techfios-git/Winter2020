package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.BankAndCashPage;
import page.LoginPage;
import util.BrowserFactory;

public class BankAndCashTest {

	WebDriver driver;

	@Test
	public void clickOnNewAccount() {
		driver = BrowserFactory.launchBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUsername("techfiosdemo@gmail.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		BankAndCashPage bankAndCashPage = PageFactory.initElements(driver, BankAndCashPage.class);
		bankAndCashPage.clickOnBankAndCashButton();
		bankAndCashPage.clickOnNewAccount();

	}

}
