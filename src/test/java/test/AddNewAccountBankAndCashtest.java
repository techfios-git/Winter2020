package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddNewAccountBankAndCashPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddNewAccountBankAndCashtest {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbletoLoginin() {
		 driver = BrowserFactory.launchBrowser();
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 loginpage.enterUsername("techfiosdemo@gmail.com");
		 loginpage.enterPassword("abc123");
		 loginpage.clickSigninButton();

		 DashBoardPage dashBoard = PageFactory.initElements(driver, DashBoardPage.class);

		 AddNewAccountBankAndCashPage addnew = PageFactory.initElements(driver, AddNewAccountBankAndCashPage.class);
		 
		 addnew.makenewaccount();
		 addnew.verifyaccount();
		 
	}

	

}
