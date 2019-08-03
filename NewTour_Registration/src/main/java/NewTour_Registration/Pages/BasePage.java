package NewTour_Registration.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	protected WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C://Users/new/git/Registration_NewTour/NewTour_Registration/References/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@AfterClass()
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();

	}
	
	
	
 
 }
	


