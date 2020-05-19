package pages;

import java.util.Random;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankandCashPage {

	WebDriver driver;

	// Declaring constructor to receive Driver connection from BrowserFactory
	// Passing the value to local Driver
	public BankandCashPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANKANDCASH_TAB_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEWACCOUNT_TAB_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_TAB_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIALBALANCE_TAB_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SUBMIT_TAB_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']")
	WebElement AC_CREATED_SUCCESS_MSG;

	// Methods to interact with elements

	public void clickBankAndCash() {
		//waitforElement(driver, 4, BANKANDCASH_TAB_LOCATOR);
		BANKANDCASH_TAB_LOCATOR.click();
		//System.out.println("Bank and cash button is visible");

	}

	

	public void clickNewAC() {

		//waitforElement(driver, 4, NEWACCOUNT_TAB_LOCATOR);
		NEWACCOUNT_TAB_LOCATOR.click();
		//System.out.println("Add new AC button is visible");
	}

	
	

	// Randomize ACTitle and Balance
	Random rnd = new Random();
	int randomnumber = rnd.nextInt(999);

	public void enterACtitle(String AC) {
		ACCOUNT_TITLE_LOCATOR.sendKeys(AC);

	}

	public void enterDescription(String description) {
		DESCRIPTION_TAB_LOCATOR.sendKeys(description);

	}

	public void enterNewBalance(String balance) {
		INITIALBALANCE_TAB_LOCATOR.sendKeys(balance);

	}

	public void clickSubmitButton() {
		SUBMIT_TAB_LOCATOR.click();
	}

	// Validation AC add Success SMG
	public void veryfyACcreatedMSG() throws InterruptedException {
	waitforElement(driver, 6, AC_CREATED_SUCCESS_MSG);
	
	
	try {
		waitforElement(driver, 6, AC_CREATED_SUCCESS_MSG);
		Thread.sleep(2000);
		System.out.println("Account was created!");
	}
	catch(ElementNotVisibleException e) {
		System.out.println("Account was not Created!");
		e.printStackTrace();
	}

	
	
}

	private void waitforElement(WebDriver driver2, int time, WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		//wait.until(ExpectedConditions.visibilityOf(BANKANDCASH_TAB_LOCATOR));
		//wait.until(ExpectedConditions.visibilityOf(NEWACCOUNT_TAB_LOCATOR));
		wait.until(ExpectedConditions.visibilityOf(AC_CREATED_SUCCESS_MSG));
		
	}
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
		
	}
	
		
		
	

