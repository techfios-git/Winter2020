package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddNewAccountPage {
	Random rnd = new Random();
	int rndNo = rnd.nextInt(999);
	String accountTitle = "sush" + rndNo;

	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = "account")
	WebElement AccountTitleLocator;
	@FindBy(how = How.ID, using = "description")
	WebElement DescriptionFieldLocator;
	@FindBy(how = How.ID, using = "balance")
	WebElement balance;
	@FindBy(how = How.XPATH, using = "//form[@role='form']/descendant::button[@type='submit']")
	WebElement submitButtonLocator;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']")
	WebElement AccountCreatedMsg;

	public void createNewAccount() {
		AccountTitleLocator.sendKeys(accountTitle);
		DescriptionFieldLocator.sendKeys("Pay");
		balance.sendKeys("1000");
		submitButtonLocator.click();
	}
	public void accountCreatedVerification() {
		Assert.assertTrue(AccountCreatedMsg.isDisplayed(), "Account not created");
	}	
		
	}
	
//	public void enterAccountTitle(String accountTitle) {
//		ACCOUNT_TITLE_LOCATOR.sendKeys("Apple :" );
//		
//	}


