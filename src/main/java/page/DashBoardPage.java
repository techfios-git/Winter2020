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
	
	//Element Library
	/*WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	By BY_USERNAME_FIELD_LOCATOR = By.id("username");*/
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Dashboard')]") WebElement DASHBOARD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[5]/a") WebElement BANK_CASH;
	@FindBy(how = How.XPATH, using = "//ul[@id='side-menu']/li[5]/ul/li[1]/a") WebElement NEW_ACCOUNT;
	@FindBy(how = How.NAME, using = "account") WebElement ACCOUNT_TITLE;
	@FindBy(how = How.NAME, using = "description") WebElement DESCRIPTION;
	@FindBy(how = How.NAME, using = "balance") WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button") WebElement SUBMIT;
	
	public void validateDashboard() {
		DASHBOARD_LOCATOR.isDisplayed();		
	}
	
	public void addNewAccount(String accountTitle, String description, String intialBalance) {
		BANK_CASH.click();
		NEW_ACCOUNT.click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 60);	
		explicitWait.until(ExpectedConditions.visibilityOf(ACCOUNT_TITLE));
		
		ACCOUNT_TITLE.sendKeys(accountTitle);
		DESCRIPTION.sendKeys(description);
		INITIAL_BALANCE.sendKeys(intialBalance);	
		SUBMIT.click();
	}
		
}
