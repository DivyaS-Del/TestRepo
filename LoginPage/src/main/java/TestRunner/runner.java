package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
plugin = { "pretty",
		"html:target/report/cucumber.html", "json:target/report/cucumber.json" },
monochrome=true)
public class runner {

}
