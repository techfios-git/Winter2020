package src;



import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

	//@Test
	//@SuppressWarnings("unused")
	public class Homework4 {		

		public static void main(String[] args, String randomNumber) throws InterruptedException {
			 String browser = "Firefox";
			 WebDriver driver = null;
		
		
		if (browser.contentEquals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BlackHole\\eclipse-workspace\\techfios-test\\lib\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
		}
		
		 else if  (browser.equalsIgnoreCase("Firefox"))
	
		{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\BlackHole\\eclipse-workspace\\techfios-test\\lib\\Drivers\\geckodriver.exe");
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
	
	driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
	//Thread.sleep(8000);
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//span[contains(text(),'CRM')]")).click();
	driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[5]/a/span[1]")).click(); //-- click on Bank and Cash
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[5]/ul/li[1]/a")).click(); //-- Add new Account
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	RandomNumbers();
	driver.findElement(By.xpath("//*[@id='account']")).sendKeys("Travel"+ randomNumber);
	//driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[2]/ul/li[2]/a")).click(); //-- select List contacts
	Thread.sleep(9000);
	//driver.findElement(By.xpath("//*[@id='uid2130']")).click(); //-- click delete button
	//driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click(); //-- click delete button
	Thread.sleep(9000);
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click(); //-- click ok button
	Thread.sleep(9000);
	//driver.findElement(By.xpath("//span[contains(text(),'CRM')]")).click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//html/body/section/div/nav/div/ul/li[2]/ul/li[1]/a")).click(); //-select add contact
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//*[@id='account']")).sendKeys("Levi Campbell");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Techfios");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sinbad1422@gmail.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("2142237885");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='address']")).sendKeys("823 Colson Dr");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Arlington");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Texas");
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("76002");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(9000);
	driver.findElement(By.xpath("//*[@id='submit']")).click();
	
	//driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
	//Thread.sleep(4000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//a[@id='New Deposit']")).click();
	//driver.findElement(By.linkText("Transfer")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	driver.findElement(By.id("select2-faccount-container")).click();
	//Thread.sleep(4000);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

	    WebElement faccountDropDown = driver.findElement(By.xpath("//span[select2-search > input:nth-child(1)'"));
	    System.out.println(faccountDropDown);
	    faccountDropDown.click();
	   List<WebElement> faccount = driver.findElements(By.cssSelector("#faccount >option"));
	   
	   for  (WebElement faccoun : faccount ) {
		   System.out.println("found account: "+faccoun);
		   
		   if(faccoun.getText().equals("Homeloan240"))
			   System.out.println("faccou");
		   {
			 faccoun.click();  
		   }
		   System.out.println("faccoun");
	   }

	    //String defaultItem = option.getText();

	    System.out.println(faccount);
	
	
	
	}
		 static void RandomNumbers() {
			Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(100);
              System.out.println("Random No : " + randomNumber);
              return;
             }
		}

	}
		
	
//    
//	
//    driver.close();
//    driver.quit();


			
		





