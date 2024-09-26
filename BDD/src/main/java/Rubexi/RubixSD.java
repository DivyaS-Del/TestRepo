package Rubexi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RubixSD {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\BDD\\src\\test\\java\\Driver\\geckodriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("the user launches the application")
	public void the_user_launches_the_application() {
		driver.get("https://rubixe.com/");
	}
	@When("a user clicks on the Product module")
	public void a_user_clicks_on_the_product_module() throws Exception {
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[3]/a"));
		element1.click();
	}
	@When("a user clicks on the AI INTERNSHIP module")
	public void a_user_clicks_on_the_ai_internship_module() throws Exception {
        Thread.sleep(2000);
        WebElement element2=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[4]/a"));
        element2.click();
        
	}
	@When("the drop-down menu should appear, displaying all relevant contents")
	public void the_drop_down_menu_should_appear_displaying_all_relevant_contents() throws Exception {
		Thread.sleep(2000);
		 WebElement element2=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[4]/a"));
	        element2.click();
	        
	        
	}
	
	@When("clicking on any item in the drop-down menu")
	public void clicking_on_any_item_in_the_drop_down_menu() {
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
		dropdown.click();
	}
	@When("a user clicks on the back button or the logo")
	public void a_user_clicks_on_the_back_button_or_the_logo() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[1]/a/img"));
		logo.click();
	}
	
	@When("a user clicks on the contact module")
	public void a_user_clicks_on_the_contact_module() {
			WebElement contact=driver.findElement(By.xpath("//*[@id=\"page-top\"]/nav/div/div[2]/ul/li[8]/a"));
			contact.click();
		
	}
	@When("a user enters their name, email address, and mobile number into the fields on the {string} page and clicks the {string} button")
	public void a_user_enters_their_name_email_address_and_mobile_number_into_the_fields_on_the_page_and_clicks_the_button(String string, String string2) throws Exception {
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.id("senderName"));
		name.sendKeys("Digisoft");
		WebElement email=driver.findElement(By.id("senderEmail"));
		email.sendKeys("Divyas18b019@gmail.com");
		WebElement mobilenumber=driver.findElement(By.id("mobileNumber"));
		mobilenumber.sendKeys("123456789");
		WebElement Box=driver.findElement(By.id("messageBox"));
		Box.sendKeys("Welcome");
	}
	@Then("the information should be submitted successfully")
	public void the_information_should_be_submitted_successfully() throws Exception {
		Thread.sleep(2000);
		WebElement submitted=driver.findElement(By.xpath("//*[@id=\"sendMessage\"]"));
		submitted.click();
		
		Thread.sleep(2000);
		driver.close();
	}
}