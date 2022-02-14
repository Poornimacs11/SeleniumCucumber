package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	By Email = By.id("email");
	By Password = By.id("password");
	By signIn = By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver  driver)
	{
		this.driver = driver;
	}
	
	public WebElement mailID()
	{
		return driver.findElement(Email);
	}
	
	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
}
