package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		 driver = BrowserFactory.launchBrowser();	
	}
	
	@Test(priority=1)
	public void validUserShouldBeAbletoLoginin() {			 
		 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);		 
		 loginpage.enterUsername("techfiosdemo@gmail.com");
		 loginpage.enterPassword("abc123");
		 loginpage.clickSigninButton();			
	}
	
	@Test(priority=2)
	public void addNewAccountTest() throws InterruptedException {
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.validateDashboard();
		dashboard.addNewAccount("testing", "adding new account", "1234");
		
	}

}
