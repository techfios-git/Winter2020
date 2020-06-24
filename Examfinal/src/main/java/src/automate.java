package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automate {
	static String browser = "Firefox";
	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		if (browser.contentEquals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"\\C:\\Users\\BlackHole\\Desktop\\Project_Automation\\Examfinal\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver",
					"\\C:\\Users\\BlackHole\\Desktop\\Project_Automation\\Examfinal\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// control window size
		driver.manage().window().maximize();

		// driver.manage()deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// go to the link
		driver.navigate().to("http://techfios.com/test/101/");
		 Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.name("allbox"));
		WebElement ToggleAll = driver.findElement(By.name("allbox"));
		Boolean checkToggleAll = ToggleAll.isSelected();
		
		if (checkToggleAll  == false) {
			System.out.println(" Toggle All is not checked!");
		}
		else {
			System.out.println("Toggle All is checked!");
			
		}
	}
	}


