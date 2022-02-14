package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public Logger logs;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\poorn\\ImPerfect\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
//			//Firefox
//			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
//			driver = new FirefoxDriver();

		}
		
		else if(browserName.equals("IE"))
		{
			//IE code
//			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
//			driver = new EdgeDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

}
