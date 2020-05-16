package Homework5;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ADDNEWACCT {


	WebDriver driver; 
	@BeforeTest
public void drivers() throws InterruptedException {

			String browser = "Firefox";
	if(browser.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver",
			".\\Driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
	} else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
driver = new FirefoxDriver();
	
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
 
	
   // Open Browser and go to site http://techfios.com/test/billing/?ng=admin/

    driver.get(" http://techfios.com/test/billing/?ng=admin/");
	
	}
	
	
	}
	
	// log in process username, password, log in

  @Test
  public void LoginTest() throws InterruptedException {
	//Element Library 
	  By User_Name = By.id("username");
	  By Password_field = By.id("password");
	  By Sign_In_Button = By.name("login");
	  By Dashboard_button = By.xpath("//span[contains(text(),'Dashboard)]");
	  By Bank_Cash_button = By.linkText("Bank & Cash");
	  By ADD_NEW_ACCOUNT = By.xpath("//a[text()='New Account']");
	  By List_account = By.xpath("//a[text() = 'New Account']");
	  By Acc_Verfication = By.xpath("//input[@placeholder='search by Name...']");
	  
	  By Submit_button = By.xpath("//form[@role='form']/descendant::button[@type='submit']");
	  String loginid = "techfiosdemo@gmail.com";
	  String password = "abc123";
	
	  driver.findElement(User_Name).sendKeys(loginid);
	  driver.findElement(Password_field).sendKeys(password);
	  driver.findElement(Sign_In_Button).click();
	  driver.findElement(Bank_Cash_button).click();
	 // driver.findElement(ADD_NEW_ACCOUNT).click();
//  	WebDriverWait wait = new WebDriverWait(driver,60);
//  	wait.until(ExpectedConditions.visibilityOfElementLocated(Bank_Cash_button));
  
// to go new account 	  
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.partialLinkText("New Account"))).build().perform();
	 driver.findElement(By.linkText("New Account")).click();
  
//	//fill in the add new account form randomize account title and balance
	 
	 String Account_TITLE = "SehrishJ";
	 String Description_TITLE = "Savings";
	 String Intial_Balane = "$1000";
	 
	 Random rnd = new Random();
	int randomNum = rnd.nextInt(99);
	driver.findElement(By.id("account")).sendKeys(Account_TITLE + randomNum);
	driver.findElement(By.id("description")).sendKeys(Description_TITLE + randomNum);
	driver.findElement(By.id("balance")).sendKeys(Intial_Balane + randomNum);
	Thread.sleep(1000);
	driver.findElement(Submit_button).click();

	//​Intermediate:
	//Validate the presence of "Account Created Successfully" message
	try {
		waitForElement(driver, 2, List_account,  Account_TITLE);
		Thread.sleep(1000);
		System.out.println("Account was created sucessfully");
	} catch (ElementNotVisibleException e) {
		System.out.println("Account was not created sucessfully");
		e.printStackTrace();
	
	}
	
	
//	
	
	
}
	private char[] nextInt(int i) {
	// TODO Auto-generated method stub
	return null;
}

	private void waitForElement(WebDriver driver2, int i, By bank_Cash_button, String account_TITLE) {
		// TODO Auto-generated method stub
		
	}

	

	}
		
	
	

	
