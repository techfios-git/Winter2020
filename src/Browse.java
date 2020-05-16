

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

	//@Test
	//@SuppressWarnings("unused")
	public class Browse {		

		public static void main(String[] args) {
			 String browser = "Firefox";
			 WebDriver driver = null;
		
		
		if (browser.contentEquals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\W2020\\techfios-test\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
		}
		
		 else if  (browser.equalsIgnoreCase("Firefox"))
	
		{
	System.setProperty("webdriver.gecko.driver", "C:\\W2020\\Maven\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
	// control window size
	driver.manage().window().maximize();
	
	
	//driver.manage()deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	// go to the link
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	//Thread.sleep(6000);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
				
	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	try {
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();
	//Thread.sleep(8000);
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	//driver.findElement(By.xpath("//span[contains(text(),'CRM')]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
	//Thread.sleep(4000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//a[@id='New Deposit']")).click();
	driver.findElement(By.linkText("Transfer")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	driver.findElement(By.id("select2-faccount-container")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

	    WebElement faccountDropDown = driver.findElement(By.id("faccount"));
	    System.out.println(faccountDropDown);
	    faccountDropDown.click();
	   List<WebElement> faccount = driver.findElements(By.cssSelector("#faccount >option"));
	   
	   for  (WebElement faccoun : faccount ) {
		   System.out.println("found account: "+faccount);
		   
		   if(faccoun.getText().equals("Homeloan240")) 
		   {
			 faccoun.click();  
		   }
		   System.out.println("faccoun");
	   }

	    //String defaultItem = option.getText();

	    System.out.println(faccount);
	
	
	
	}
	
	
//    
//	
//    driver.close();
//    driver.quit();


			
		}





