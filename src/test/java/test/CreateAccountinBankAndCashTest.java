package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CreateAccountInBankAndCashPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class CreateAccountinBankAndCashTest {
	WebDriver driver;

	@Test
	public void ValidUserShouldBeAbleToCreateAccount() {
	
	 driver = BrowserFactory.launchBrowser();
	 
	 
	 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	 
	 loginpage.enterUsername("techfiosdemo@gmail.com");
	 loginpage.enterPassword("abc123");
	 loginpage.clickSigninButton();
	
	DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);
	 
	 CreateAccountInBankAndCashPage BankAndCash = PageFactory.initElements(driver, CreateAccountInBankAndCashPage.class);
	
	 BankAndCash.CreateAccount();
	 BankAndCash.VerifyAccountCreated();
	}






}
