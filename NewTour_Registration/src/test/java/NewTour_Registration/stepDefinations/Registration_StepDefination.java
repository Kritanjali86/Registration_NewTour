package NewTour_Registration.stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registration_StepDefination {
	@Given("^User launch the URL$")
	public void user_launch_the_URL() throws Throwable {
	    System.out.println("This is Test 1");
	}

	@Then("^User clicks on the Register button$")
	public void user_clicks_on_the_Register_button() throws Throwable {
		System.out.println("This is Test 2");
	}

	@And("^User enter all the information in the Registration Page$")
	public void user_enter_all_the_information_in_the_Registration_Page() throws Throwable {
		System.out.println("This is Test 3");
	}

	@And("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() throws Throwable {
		System.out.println("This is Test 4");
	}

	@And("^User login with the username and password$")
	public void user_login_with_the_username_and_password() throws Throwable {
		System.out.println("This is Test 5");
	}

	@Then("^User should be able to login successfully\\.$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("This is Test 6");
	}

	
	
	

}
