package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Declaring constructor to receive Driver connection from BrowserFactory
	// Passing the value to local Driver

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_BUTTON_LOCATOR;

	// Methods to interact with element
	public void enteredUserName(String username) {
		USERNAME_FIELD_LOCATOR.sendKeys(username);

	}

	public void enteredPassword(String password) {
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_LOCATOR.click();
	}

}
