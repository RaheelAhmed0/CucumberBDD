package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:target/cucumber_reports/Report.html"},
		monochrome = true,
		dryRun = false,
		tags = "@S1"
		)
public class TestRunner {

}
