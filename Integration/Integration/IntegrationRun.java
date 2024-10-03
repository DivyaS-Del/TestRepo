package Integration;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Integration/Integration.feature"},
glue={"Integration"},
plugin = { "pretty",
		"html:target/report/cucumber.html", 
"json:target/report/cucumber.json" },
monochrome=true,
dryRun=false)
public class IntegrationRun {

}
