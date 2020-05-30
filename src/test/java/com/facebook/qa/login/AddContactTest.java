package com.facebook.qa.login;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddContactTest {
	private static final By Page_TITLE_LOCATOR = null;
	WebDriver driver;
	private FluentWait<WebDriver> wait;
	@Test
	public void AddContact() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				".\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();// opening webdriver 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		// identifying the password box and passing password
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//library of element 
		WebElement dashboardtitle = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	


	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"))));
		By CRM_SIDE_NAV_LOCATOR = By.xpath(" //i[@class='fa fa-building-o')]/descendant::span[text()='CRM']");
		By ADD_CONTACT_SIDE_NAV_LOCATOR = By.xpath("//span[text()='CRM']/parents::*/following-sibling:ul/descendant::a[contains(@href,'ad']");
		By Full_Name_Input_FILED_LOCATOR = By.id("FullName");
		By ADDRESS_INPUT_FILED_LOCATOR = By.id("ADDRESS");
		By COMPANY_NAME_INPUT_FILED_LOCATOR = By.id("COMPANY");
		By EMAIL_INPUT_FILED_LOCATOR = By.id("EMAIL");
	//	By FULL_NAME_INPUT_FILEDLOCATOR = By.id("account");
	
		Random rnd =  new Random();
		int randomnumber = rnd.nextInt(999);
		
		
		String fullName = " Sehrish J"+ randomnumber;
		String CompanyName= " techfios"+randomnumber;
		String email = "sjamil2" + randomnumber+ "@gamil.com";
		
		
		
		//Expilicit wait given to the driver
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Page_TITLE_LOCATOR));
//		
		//open CRM

		driver.findElement(CRM_SIDE_NAV_LOCATOR).click();
	//	waitForElement(driver,10, ADD_CONTACT_SIDE_NAV_LOCATOR);
		//click on Add Contact
		driver.findElement(ADD_CONTACT_SIDE_NAV_LOCATOR);
		
	driver.findElement(Full_Name_Input_FILED_LOCATOR).sendKeys(fullName);
	driver.findElement(COMPANY_NAME_INPUT_FILED_LOCATOR).sendKeys(CompanyName);
	driver.findElement(EMAIL_INPUT_FILED_LOCATOR).sendKeys(email);
	// to stop and observe, but do not unless you have
	Thread.sleep(5000);
	
//		driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
//		driver.findElement(By.id("account")).sendKeys("john smith");
//		driver.findElement(By.id("company ")).sendKeys("nokia");
//		driver.findElement(By.id(" email")).sendKeys("john@gmail.com");
//		driver.findElement(By.id("phone ")).sendKeys("3456789");
//		driver.findElement(By.id("address ")).sendKeys("3317 finger drive");
//		driver.findElement(By.id("city ")).sendKeys("Mckinney");
//		driver.findElement(By.id("state ")).sendKeys("Texas");
//		driver.findElement(By.id("zip")).sendKeys("75071");
//		driver.findElement(By.id("submit"));
//	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
