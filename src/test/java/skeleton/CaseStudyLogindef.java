package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.DiverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CaseStudyLogin;


public class CaseStudyLogindef {
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DiverUtility.getDriver("chrome");
		PageFactory.initElements(driver,CaseStudyLogin.class );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@Given(":url of the TestmeApp")
	public void url_of_the_TestmeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When(": user enters the data for LoginPage")
	public void user_enters_the_data_for_LoginPage() {
		CaseStudyLogin.username.sendKeys("admin");
		CaseStudyLogin.password.sendKeys("Password456");
		CaseStudyLogin.loginbutton.click();
	    CaseStudyLogin.addproduct.click();
	    CaseStudyLogin.categoryname.click();
	    CaseStudyLogin.subcategoryname.click();
	    CaseStudyLogin.productname.sendKeys("Hp Laptop");
	    CaseStudyLogin.priceid.sendKeys("3000");
	    CaseStudyLogin.Quality.sendKeys("21");
	    CaseStudyLogin.brand.sendKeys("abc");
	    CaseStudyLogin.description.sendKeys("asjedhfnchgrgegfrt3");
	    CaseStudyLogin.fileupload.click();
	    CaseStudyLogin.addproduct1.click();
	}

	@Then(":user is Login successfully")
	public void user_is_Login_successfully() {
	   
	}


}