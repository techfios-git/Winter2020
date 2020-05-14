package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {

	WebDriver driver;
	public BankAndCashPage(WebDriver driver) {
		this.driver = driver ;
	}
	@FindBy(how = How.XPATH ,using ="//span[contains(text(),'Bank & Cash')]") WebElement BANK_AND_CASH_LOCATOR;
	@FindBy(how = How.XPATH ,using= "//a[text()='New Account']") WebElement NEW_ACCOUNT_LOCATOR ;

	public void clickOnBankAndCashButton() {
		BANK_AND_CASH_LOCATOR.click();
	}
	public void clickOnNewAccount() {
		NEW_ACCOUNT_LOCATOR.click();
	}
}
