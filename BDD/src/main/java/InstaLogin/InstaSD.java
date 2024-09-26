package InstaLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class InstaSD {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside the step- user is browser is open");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\CucumberProjects\\src\\test\\java\\Drivers\\geckodriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);

	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@When("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {

		System.out.println("Inside the step-teardown");
		driver.getPageSource().contains("Log in as ADMIN");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
