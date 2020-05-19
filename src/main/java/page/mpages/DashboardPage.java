package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	WebDriver driver;

	// Declaring constructor to receive Driver connection from BrowserFactory
	// Passing the value to local Driver
	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_TAB_LOCATOR;

	// Methods to verify visibility of Dashboard.
	public void dashboardTabVisibility() {
		wetForElement(driver, 2, DASHBOARD_TAB_LOCATOR);
		DASHBOARD_TAB_LOCATOR.click();
		System.out.println("Dashboard button is visible");

	}

	private void wetForElement(WebDriver driver, int time, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(DASHBOARD_TAB_LOCATOR));
		
	}

}
