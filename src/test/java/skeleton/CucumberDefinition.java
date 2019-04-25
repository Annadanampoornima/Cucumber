package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDefinition {
	 person sean=new person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	   sean.setDistance(int1);
	}

	@When("sean shouts {string}")
	public void sean_shouts(String string) {
	    sean.setMessage(string);
	}

	
	@Then("Lucia {string} to the message")
	public void lucia_Listens_to_the_message(String flag ) {
		if(flag.contentEquals("Listens"))
		{
			String message=sean.getMessage();
			Assert.assertEquals("Free coffee", message);
		}
		else if(flag.contentEquals("cannot Listens"))
		{
			String message=sean.getMessage();
					Assert.assertEquals("cannot hear", message);
		}
	    
}



}
