package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Element Library
	/*WebElement WEBELEMENT_USERNAME_FIELD_LOCATOR = driver.findElement(By.id("username"));
	By BY_USERNAME_FIELD_LOCATOR = By.id("username");*/
	@FindBy(how = How.ID, using = "username") WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_LOCATOR;
	
	//Method to interact with the elements
	public void enterUsername(String userName) {
		USERNAME_FIELD_LOCATOR.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_LOCATOR.click();
	}
	
	
	/*public void login(String userName, String password) {
		USERNAME_FIELD_LOCATOR.sendKeys(userName);
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
		SIGNIN_BUTTON_LOCATOR.click();
	}*/

}
