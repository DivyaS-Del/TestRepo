package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter valid username")
	public void user_enter_valid_username() throws Exception {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("User enter valid password")
	public void user_enter_valid_password() throws Exception {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user click on admin module")
	public void user_click_on_admin_module() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
	}

	@When("user click on add button")
	public void user_click_on_add_button() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='button'])[6]")).click();
	}

	@When("user click on user drop-down of user role")
	public void user_click_on_user_drop_down_of_user_role() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"))
				.click();
	}

	@When("user click on if any one")
	public void user_click_on_if_any_one() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-select-text-input'][1]")).click();
	}

	@When("user enter userName")
	public void user_enter_user_name() throws Exception {
		Thread.sleep(2000);
		WebElement wb= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		wb.sendKeys("Pratap");
	}

}