package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BankandCashPage;
import pages.LoginPage;
import util.BrowserFactory;

public class BankAndCashTest {

	WebDriver driver;

	@Test
	public void validusershouldbeabletologin() throws InterruptedException {
		// connect with BrowserFactory
		driver = BrowserFactory.launchBrowser();

		// create page factory to call the LoginPage
		LoginPage LoginPage = PageFactory.initElements(driver, LoginPage.class);
		BankandCashPage BankandCashPage = PageFactory.initElements(driver, BankandCashPage.class);
		// call the methods
		LoginPage.enteredUserName("techfiosdemo@gmail.com");
		LoginPage.enteredPassword("abc123");
		LoginPage.clickSigninButton();

		// Thread.sleep(2000);
		BankandCashPage.clickBankAndCash();
		// Thread.sleep(2000);
		BankandCashPage.clickNewAC();
		// Thread.sleep(2000);
		BankandCashPage.enterACtitle("Aurther");
		BankandCashPage.enterDescription("Backyard Project");
		BankandCashPage.enterNewBalance("500");
		BankandCashPage.clickSubmitButton();
		BankandCashPage.veryfyACcreatedMSG();

		// Page scroll up and down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,1200)");
		Thread.sleep(2000);
		js.executeScript("scroll(0,-1200)");
		Thread.sleep(2000);

		BankandCashPage.tearDown();

	}

}
