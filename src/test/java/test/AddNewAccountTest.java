package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddNewAccountPage;
import page.BankAndCashPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddNewAccountTest {
	WebDriver driver;

	@Test
	public void addNewAccount() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.enterUsername("techfiosdemo@gmail.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		BankAndCashPage bankAndCashPage = PageFactory.initElements(driver, BankAndCashPage.class);
		bankAndCashPage.clickOnBankAndCashButton();
		bankAndCashPage.clickOnNewAccount();
		AddNewAccountPage addNewAccountPage = PageFactory.initElements(driver, AddNewAccountPage.class);
		addNewAccountPage.createNewAccount();
		addNewAccountPage.accountCreatedVerification();
		Thread.sleep(1000);
		
}
}
