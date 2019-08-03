package NewTour_Registration.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/java/NewTour_Registration/features" },
		glue = { "NewTour_Registration.stepDefinations" },

		monochrome = true, tags = {},

		// plugin = {
		// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}

		// plugin = ("json:target/cucumber-reports/CucumberTestReport.json")

		// plugin
		// ={"pretty","html:target/cucumber","json:target/cucumber-reports/cucumber.json",

		// "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}

		//format = { "pretty", "html:test-output_1",
				//"json:target/cucumber-reports/CucumberTestReport.json" }, 
		//plugin = ("json:target/cucumber-reports/CucumberTestReport.json")

		//plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-reports/cucumber.json"}
		
		 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml",
				 "html:target/cucumber-reports"}
)

public class MainRunner extends AbstractTestNGCucumberTests {

}
