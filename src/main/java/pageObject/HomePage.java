package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	By loginBtn = By.cssSelector(".navbar-link.fedora-navbar-link");
	By Signup = By.id("header-sign-up-btn");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
		
	public LoginPage doLogin()
	{
		driver.findElement(loginBtn).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
		
	}

	public WebElement signUpBtn()
	{
		return driver.findElement(Signup);
	}
	
}
