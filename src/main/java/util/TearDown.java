package util;

import org.openqa.selenium.WebDriver;

public class TearDown {
	WebDriver driver ;

	public TearDown(WebDriver driver) {
		this.driver = driver ;
	}
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
