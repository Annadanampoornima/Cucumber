package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.DiverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.RegisterPage;

public class RegisterPagedef {
	WebDriver driver;
	private String message;
	@Before
	public void init()
	{

		driver=DiverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given(":url of the demowebshop")
	public void url_of_the_demowebshop() {
		driver.get("http://demowebshop.tricentis.com/register");  
	}

	@When(": user enters the data for registration")
	public void user_enters_the_data_for_registration() {
		   RegisterPage.gender.click();
		   RegisterPage.firstname.sendKeys("9Annadanam7");
		   RegisterPage.lastname.sendKeys("9Poornimaa");
		   RegisterPage.email.sendKeys("abcmail4590@test.com");
		   RegisterPage.password.sendKeys("abc40899156");
		   RegisterPage.confirmpassword.sendKeys("abc40899156");
		   RegisterPage.registerbutton.click();
	   
	}

	@Then(":user is registered successfully")
	public void user_is_registered_successfully() {
	    
	}


}
