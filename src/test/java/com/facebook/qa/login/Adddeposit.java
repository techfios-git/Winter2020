package com.facebook.qa.login;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adddeposit {

WebDriver driver;

	
	@Test
	public void launchbrowser() {
		WebDriver  driver;

		System.setProperty("webdriver.gecko.driver","C:\\Seleniumsavedfile\\newtrial-test\\firefoxdriver\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		
		
		//	
//	
//
//WebDriver driver;
//	
//	public void AddContact() throws InterruptedException {
//		
//		
//		System.out.println("Navigating application");
//		driver.get("http://techfios.com/test/billing/?ng=admin/");
//		
//		driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("abc123");
//		driver.findElement(By.name("login")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	//	WebElement dashboardtitle = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"))));
//		driver.findElement(By.xpath("//*[contains(text(),'Add Deposit')]")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[contains(text(),'Bank & Cash')]")).click();
//		//driver.findElement(By.partialLinkText("/html/body/section/div/nav/div/ul/li[5]/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'Add New Account')]")).isDisplayed();
//		driver.findElement(By.id("account")).sendKeys("SehrishJ@gmail.com");
//		driver.findElement(By.id("description")).sendKeys("Phonebill");
//		driver.findElement(By.id("balance")).sendKeys("$10");
//		//driver.findElement(By.id("submit"));
//		
//		//Thread.sleep(2000);
//		
//		
//
//	
//		
//		
//		
//		
//		
//		//driver.findElement(By.xpath("//*[contains(text(),'Bank & Cash')]")).click();
//		
////		WebElement account_dropdown = driver.findElement(By.className("fa fa-building-o"));
////		Select account = new Select(account_dropdown);
////		account.selectByIndex(0);
////	account.selectByVisibleText("New Account");
////	driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
////		
//
//		//Thread.sleep(1000);
//	//	driver.navigate().back();

		
}
	
		
	

}


	