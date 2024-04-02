package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/click.feature",
		glue={"gustasi_home"},
		 plugin = {"pretty", "html:src/test/resources/target/CucumberReports/CucumberReport.html"}
		
		)
public class TestRunner {
}
