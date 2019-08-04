package NewTour_Registration.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
		Country.sendKeys(strCountry);
	}

	
	// Entering the User Information 
	public void setusername(String strusername) {
		username.sendKeys(strusername);
	}
	
	public void setPassword(String strPassword) {
		Password.sendKeys(strPassword);
	}
	public void setconfirmPassword(String strconfirmPassword) {
		confirmPassword.sendKeys(strconfirmPassword);
	}
	public void setRegister(String strRegister) {
		Register.sendKeys(strRegister);
	}
	
	public void Register(){
		registrationButton.click();
	}
	public void Contact_Info(){
		// Click on the Registration Button 
		setFirstName("Mandesh");
		setlastName("Giri");
		setphoneNo("222-22-2222");
		setemail("test@test.com");
		
		setAddress("123 TEST ");
		setCity("Test Test");
		setState("MD");
		setpostalCode("20879");
	   Select Countrydp= new Select(Country);
	   Countrydp.selectByIndex(215);
	   setusername("mercury");
	   setPassword("mercury");
	   setconfirmPassword("mercury");
	 //String username= driver.findElement(By.name("email")).getAttribute("value");
	 //System.out.println(username);
}
	public void submitRegistration(){
		 Register.click();
		 //String output = driver findElement(By
							//.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"))
					//.getText();
			//output = output.split(" ")[5];
			//System.out.println("Output is :" + output);
			
	}
		public void validateUsername(){
			  String username= driver.findElement(By.name("email")).getAttribute("value");
			  System.out.println(username);
			  
			  String output = driver
						.findElement(By
								.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"))
						.getText();
				output = output.split(" ")[5];
				System.out.println("Output is :" + output);
				
		if(username.equals(output)){
			System.out.println("Test Passed");
		}
		else{
			System.out.println("Test Failed");
		}
				
				
			}
			  
			  
			  
		}
	
	
	
	

