package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeSD {
	WebDriver driver = null;
	private Object admin;
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\CucumberH\\src\\main\\java\\Orange\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@When("the user launches the application")
	public void the_user_launches_the_application() throws Exception {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@When("User enter valid username")
	public void user_enter_valid_username() throws Exception {
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	    Thread.sleep(2000);
	    
	}
	
	@When("User enter valid password")
	public void user_enter_valid_password() throws Exception {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	   Thread.sleep(2000);
	}
	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   Thread.sleep(2000);
	}	
	@Then("user click on admin module")
	public void user_click_on_admin_module() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	}

	}

