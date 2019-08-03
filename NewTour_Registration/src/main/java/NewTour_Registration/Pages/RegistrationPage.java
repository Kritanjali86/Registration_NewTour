package NewTour_Registration.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement registrationButton;

	// Contact Info
	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "lastName")
	WebElement lastname;

	@FindBy(name = "phone")
	WebElement phoneNo;

	@FindBy(name = "userName")
	WebElement email;

	// Mailing Info
	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	@FindBy(name = "country")
	WebElement Country;

	// User Information
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;

	@FindBy(name = "register")
	WebElement Register;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * Entering Contact Information for the User for the Registration
	 */

	// Enterering the Contact Info
	public void setFirstName(String strFristName) {
		firstname.sendKeys(strFristName);
	}

	public void setlastName(String strlastName) {
		lastname.sendKeys(strlastName);
	}

	public void setphoneNo(String strphoneNo) {
		phoneNo.sendKeys(strphoneNo);
	}

	public void setemail(String stremail) {
		email.sendKeys(stremail);
	}

	// Entering Mailing Address
	public void setAddress(String strAddress) {
		Address.sendKeys(strAddress);
	}

	public void setCity(String strCity) {
		City.sendKeys(strCity);
	}

	public void setState(String strState) {
		State.sendKeys(strState);
	}

	public void setpostalCode(String strpostalCode) {
		postalCode.sendKeys(strpostalCode);
	}

	public void setCountry(String strCountry) {
		City.sendKeys(strCountry);
	}

	
	// Entering the User Information 
	public void setusername(String strusername) {
		State.sendKeys(strusername);
	}
	
	public void setPassword(String strPassword) {
		State.sendKeys(strPassword);
	}
	public void setconfirmPassword(String strconfirmPassword) {
		State.sendKeys(strconfirmPassword);
	}
	public void setRegister(String strRegister) {
		Register.sendKeys(strRegister);
	}
	
}
