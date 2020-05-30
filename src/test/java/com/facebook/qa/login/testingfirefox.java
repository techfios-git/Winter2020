package com.facebook.qa.login;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testingfirefox {
	
	public static void main(String[] args) throws InterruptedException{
	}
		WebDriver driver;
		@Test
		public void drivers() {
		
			String browser = "Chrome";
					if(browser.contentEquals("chrome")) {
						System.setProperty("webdriver.chrome.driver","C:\\Seleniumsavedfile\\login\\Driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					}
					else if (browser==("firefox")){
						System.setProperty("webdriver.gecko.driver", "C:\\Seleniumsavedfile\\login\\Driver\\geckodriver.exe");
					}
       WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://techfios.com/test/billing?ng=login/");  
		
		
        
    driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();

	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement dashboardtitle = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"))));
	//add deposite locator by linked text
	
	

	
	
	
By addDepositePanelHeaderLocator= By.xpath("//h5[contains(text(),'Add Deposit')]");
driver.findElement(By.xpath("//*[contains(text(),'Add Deposit')]")).click();
//      // doing drop down
WebElement account = driver.findElement(By.xpath("//div[@class='form-group']//descendant::select"));
//WebElement account = driver.findElement(By.id("account"));
Select select = new Select(account);
select.selectByVisibleText("Homeloan240");
//Select sel = new Select(account);
//sel.selectByVisibleText("abxc");
//        
        
        
        
        
        
        
		
	}

}




//
//Scenario: Users will be able to add deposit
//1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
//2. Enter username: techfiosdemo@gmail.com
//3. Enter password: abc123
//4. Click login button
//5. Click on Add Deposit button on Dashboard Page
//6. Click on Open An Account drop down to expand it,
//7. Click on any account name,
//8. Type any description,
//9. Type any amount,
//10. Click on submit button,
//Visually check to make sure the deposit posted
