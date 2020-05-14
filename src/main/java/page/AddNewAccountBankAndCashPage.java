package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddNewAccountBankAndCashPage {
	Random rnd = new Random();
	int randomNumber = rnd.nextInt(999);
	String AccountTitle = "Moqaddas"+randomNumber;
	String InitialBalance = String.valueOf(randomNumber);


WebDriver driver;
	
	public AddNewAccountBankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	
	//Element Library
	
	@FindBy (how = How.XPATH, using ="//span[contains(text(),'Bank')]") WebElement BankAndCash;
	@FindBy (how = How.XPATH, using = "//ul[@class='nav nav-second-level collapse in']/descendant::a") WebElement NewAccount;
	@FindBy(how = How.XPATH, using ="//div[@class='form-group']/child::input[@name='account']") WebElement AccountName;
	@FindBy(how = How.XPATH, using ="//div[@class='form-group']/child::input[@name='description']")WebElement description;
	@FindBy(how = How.XPATH, using = "//div[@class='form-group']/child::input[@name='balance']")WebElement balance;
	@FindBy (how = How.XPATH, using ="//form[@name='accadd']/child::button")WebElement SubmitButton;
	@FindBy (how = How.XPATH, using ="//div[@class='alert alert-success fade in']")WebElement Verify_account;

	public void makenewaccount() {
		
		BankAndCash.click();
		NewAccount.click();
		AccountName.sendKeys(AccountTitle);
		description.sendKeys("collge fund");
		balance.sendKeys(InitialBalance);
		SubmitButton.click();
	}
	
	public void verifyaccount() {
		
		Assert.assertTrue(Verify_account.isDisplayed(), "Account not added");
	}
}
