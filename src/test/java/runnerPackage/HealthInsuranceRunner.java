package runnerPackage;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features={"C:\\Users\\ACC\\eclipse-workspace\\coverfoxTesting\\src\\test\\resources\\FeatureFiles\\CoverfoxHealthInsurance.feature"},
		glue= { "stepDefinations","hooks"},
		plugin = { "pretty" ,"html:target/cucumber-reports/reports.html"},
		publish = true,
		dryRun = false
		
		)


@Test
public class HealthInsuranceRunner extends AbstractTestNGCucumberTests
{
	
	

}
