package skeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.DiverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Before
	public void before()
	{
		 driver=DiverUtility.getDriver("chrome");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After
	public void after() {
		
	}
		@Given("The URL of TestMe App")
	 public void the_URL_of_TestMe_App() {
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User Enter {word} as username")
	public void user_Enter_as_username(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	}


	@When("user Enter {word} as Password")
	public void user_Enter_as_Password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@Then("User is in Admin home")
	public void user_is_in_home_page() {
		driver.findElement(By.name("Login")).click();
		
	    
	}
	
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> list=dataTable.asLists();
		for(List<String> list2 :list) {
			for(String s:list2)
			System.out.println(s+"\t");
	
		}
		System.out.println();
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage(List<String>s) {
	   for(String string : s) {
		   System.out.println(string);
	   }
	}
	@Given("The URL of Testme App")
	public void the_URL_of_Testme_App() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}
	


}
