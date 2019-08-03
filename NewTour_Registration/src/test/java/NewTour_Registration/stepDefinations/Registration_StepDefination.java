package NewTour_Registration.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import NewTour_Registration.Pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registration_StepDefination {
	WebDriver driver;
		RegistrationPage RegisterPage;
	
	@Given("^User launch the URL$")
	public void user_launch_the_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C://Users/new/git/Registration_NewTour/NewTour_Registration/References/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		this.driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@Then("^User clicks on the Register button$")
	public void user_clicks_on_the_Register_button() throws Throwable {
		RegisterPage=  new  RegistrationPage(driver);
		RegisterPage.Register();
	}

	@And("^User enter all the information in the Registration Page$")
	public void user_enter_all_the_information_in_the_Registration_Page() throws Throwable {
		RegisterPage=  new  RegistrationPage(driver);
		RegisterPage.Contact_Info();
		
	}

	@And("^User clicks on the Submit button$")
	public void user_clicks_on_the_Submit_button() throws Throwable {
		RegisterPage=  new  RegistrationPage(driver);
		RegisterPage.submitRegistration();
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
