package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	WebDriver driver;
	By myProduct = By.xpath("//header[@class='v1-header'] //div/ul/li[1]");
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement myProduct()
	{
		return driver.findElement(myProduct);
	}

}
