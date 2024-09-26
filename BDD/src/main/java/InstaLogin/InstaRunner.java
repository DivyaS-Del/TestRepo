package InstaLogin;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/InstaLogin/Insta.feature"},glue={"InstaLogin"},
plugin = { "pretty",
		"html:target/report/cucumber.html","json:target/report/cucumber.json" },
monochrome=true)

public class InstaRunner{

}
