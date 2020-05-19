package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	/*
	 * WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR =
	 * driver.findElement(By.id("username")); By BY_USERNAME_FIELD_LOCATOR =
	 * By.id("username");
	 */
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD_LOCATOR;
	
	// method to interact with element
	public void verifyDashboardTab() {
		wetForElement(driver,2,DASHBOARD_LOCATOR);
		
	}

	private void wetForElement(WebDriver driver2, int time, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(DASHBOARD_LOCATOR));
		
	}

}
