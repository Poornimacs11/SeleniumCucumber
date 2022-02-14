package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MainPage;
import resource.base;

public class stepDefinition extends base{

	@Given("Login to {string} site")
	public void Login_to_site(String arg) throws IOException
	{
		driver = initializeDriver();
		driver.get(arg);
	}
	
	/*@When("Click on login button and enter valid {string} and {string} and click on login button")
	public void Click_on_login_button_and_enter_valid_and_click_on_login_button(String arg1, String arg2)
	{
		HomePage hp = new HomePage(driver);
		LoginPage lp = hp.doLogin();
		lp.mailID().sendKeys(arg1);		
		lp.password().sendKeys(arg2);
		lp.signIn().click();
		
	} */
	
	@When("^Click on login button and enter valid (.+) and (.+) and click on login button$")
    public void click_on_login_button_and_enter_valid_and_and_click_on_login_button(String username, String password) throws Throwable {
		HomePage hp = new HomePage(driver);
		LoginPage lp = hp.doLogin();
		lp.mailID().sendKeys(username);		
		lp.password().sendKeys(password);
		lp.signIn().click();
    }
	
	@Then("Validate if login successful")
	public void Validate_if_login_successful()
	{
		MainPage mp = new MainPage(driver);
		Assert.assertTrue(mp.myProduct().isDisplayed());
	}
	
	
	@And("Close all browsers")
	public void Close_all_browsers()
	{
		driver.quit();
		
	}
}
