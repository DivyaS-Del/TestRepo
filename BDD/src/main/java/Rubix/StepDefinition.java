package Rubix;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	RubixLogin r1=new RubixLogin();

	@Given("the application is installed on the desired platform \\(IE, Edge, Chrome, Mac)")
	public void the_application_is_installed_on_the_desired_platform_ie_edge_chrome_mac() {
	  // the_application_is_installed_on_the_desired_platform_ie_edge_chrome_mac();
		r1.desiredplatform();
	}

	@When("the user launches the application")
	public void the_user_launches_the_application() {
	   r1.launchesapplication();
	}

	@Then("the application should open successfully on the respective platform")
	public void the_application_should_open_successfully_on_the_respective_platform() {
	
	}

	@Then("the {string} logo should be displayed on the UI page")
	public void the_logo_should_be_displayed_on_the_ui_page(String string) {
	
	
	
	}
	
}
