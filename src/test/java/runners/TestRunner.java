package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		features = {"src/test/resources/functionaltests"},	
		glue= {"stepdefinitions","utilities"},
		tags= {"@SMOKE"},
		monochrome = true,
		plugin = {	
					"json:target/cucumber-reports/Cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
					"pretty","html:target/cucumber-reports"
				 }		
		)
public class TestRunner {

}
