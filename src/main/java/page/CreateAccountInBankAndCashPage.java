package page;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountInBankAndCashPage {
	Random rnd = new Random();
	int randomNumber = rnd.nextInt(999);
	String AccountTitle = "Moqaddas"+randomNumber;
	String InitialBalance1 = String.valueOf(randomNumber);
WebDriver driver;
	
	public CreateAccountInBankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}
//Element Library
@FindBy (how = How.XPATH, using = "//span[contains(text(),'Bank')]")WebElement BankAndCash;
@FindBy (how = How.XPATH, using = "//ul[@class='nav nav-second-level collapse in']/descendant::a")WebElement AddAccount;
@FindBy (how = How.XPATH, using = "//div[@class='form-group']/child::input[@name='account']")WebElement AccountTitle1;
@FindBy (how = How.XPATH, using = "//div[@class='form-group']/child::input[@name='description']")WebElement Description;
@FindBy (how = How.XPATH, using = "//div[@class='form-group']/child::input[@name='balance']")WebElement InitialBalance;
@FindBy (how = How.XPATH, using = "//form[@name='accadd']/child::button")WebElement SubmitButton;
@FindBy (how = How.XPATH, using = "//div[@class='alert alert-success fade in']")WebElement add_success;

	

public void CreateAccount() {
	BankAndCash.click();
	AddAccount.click();
	AccountTitle1.sendKeys(AccountTitle);
	Description.sendKeys("College Fund");
	InitialBalance.sendKeys(InitialBalance1);
	SubmitButton.click();
}

public void VerifyAccountCreated() {
	org.testng.Assert.assertTrue(add_success.isDisplayed(), "failed");;
	
	
}

}
