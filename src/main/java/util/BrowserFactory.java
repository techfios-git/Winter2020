package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	//declaring class level webdriver
	static WebDriver driver;
	
	//creating a non-void method to call chrome browser and go to destination site and return a WebDriver
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\14693\\eclipse-workspace-Selenium\\POMProject_Farhana\\Drivers\\chromedriver.exe"); //locate chrome .exe files
		driver = new ChromeDriver(); //driver is a chrome driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait for 10 sec before timeout
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	
	
}
