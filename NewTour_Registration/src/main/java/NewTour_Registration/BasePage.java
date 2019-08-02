package NewTour_Registration;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage (WebDriver driver){
		this.driver= driver;
		
	}
	
	public loginPage(){
		
		return new loginPage(driver);
		
	}

}
