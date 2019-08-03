package NewTour_Registration.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignonPage {
	/**
	 * All WebElements are identified by @FindBy annotation
	 * 
	 * 
	 */
	
	RegistrationPage RegisterPage;
	WebDriver driver;
	@FindBy(name = "userName")
	WebElement username;

	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "login")
	WebElement  LoginButton;
	
	public SignonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	
public void setUserName(String UserName){
	username.sendKeys(UserName);
}

public void login(){
  String username= driver.findElement(By.name("email")).getAttribute("value");
	  System.out.println(username);
	setUserName(username);
}

}

