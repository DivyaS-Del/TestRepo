package Rubexi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Rubexi/rubixe.feature"},glue={"Rubexi"},
plugin = { "pretty",
		"html:target/report/cucumber.html", "json:target/report/cucumber.json" },
dryRun=false,
monochrome=true)

public class RubixRR {

	
}
