package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.DiverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CaseStudyAddtoproduct;

public class CaseStudyAddtoproductdef {
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DiverUtility.getDriver("chrome");
		PageFactory.initElements(driver,CaseStudyAddtoproduct.class );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given(":url of  TestmeApp")
	public void url_of_TestmeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");  
	}

	@When(": user enters the data for payment")
	public void user_enters_the_data_for_payment() {
		CaseStudyAddtoproduct.username.sendKeys("Lalitha");
		CaseStudyAddtoproduct.password.sendKeys("Password123");
		CaseStudyAddtoproduct.loginbutton.click(); 
		CaseStudyAddtoproduct.homepage.click();
		CaseStudyAddtoproduct.allcategory.sendKeys("Headphone");
		CaseStudyAddtoproduct.allcategory1.click();
		CaseStudyAddtoproduct.addtocart.click();
		CaseStudyAddtoproduct.cart.click();
		CaseStudyAddtoproduct.checkout.click();
		CaseStudyAddtoproduct.proceedtopay.click();
		CaseStudyAddtoproduct.Bank.click();
			
		}

	@Then(":user Product is  successfully order")
	public void user_Product_is_successfully_order() {
	    
	}

	
}
