package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActSD {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside the step- user is browser is open");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\Task\\src\\test\\java\\Driver\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
	}

	@When("user enter the webpage current url")
	public void user_enter_the_webpage_current_url() throws Exception {
		driver.get("https://www.actitime.com/");
		Thread.sleep(2000);
	}

	@When("user click on Login")
	public void user_click_on_login() {
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/header/div[2]/div/div[2]/div/div[1]/a[1]"));
		wb.click();
	}

	@When("user enter email")
	public void user_enter_email() throws Exception {
		WebElement wb = driver.findElement(By.id("Enteryouremail"));
		wb.sendKeys("divyas18b019@gmail.com");
		Thread.sleep(2000);
	}

	@When("click on send code")
	public void click_on_send_code() throws Exception {
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div/button"));
		wb.click();
		Thread.sleep(30000);
	}

	@When("user click on Tasks button")
	public void user_click_on_tasks_button() throws Exception {
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[4]/a"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on add new button")
	public void user_click_on_add_new_button() throws Exception {
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[1]"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on the new customer module")
	public void user_click_on_the_new_customer_module() throws Exception {
		WebElement wb = driver.findElement(By.xpath("/html/body/div[20]/div[1]"));
		wb.click();
		Thread.sleep(2000);

	}

	@When("user close the customer module")
	public void user_close_the_customer_module() throws Exception {
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"customerLightBoxCloseButton\"]"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on the add new button")
	public void user_click_on_the_add_new_button() throws Exception {
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[1]"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on the new project module")
	public void user_click_on_the_new_project_module() throws Exception {
		WebElement wb = driver.findElement(By.xpath("/html/body/div[20]/div[2]"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user close the new Project module")
	public void user_close_the_new_project_module() throws Exception {
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"closeProjectLightBoxBtn\"]"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on search bar and enter the value")
	public void user_click_on_search_bar_and_enter_the_value() throws Exception {
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[4]/div/div/div[1]/div[1]/input"));
		wb.sendKeys("Android calibration");
		Thread.sleep(2000);
	}

	@When("user click on status button")
	public void user_click_on_status_button() throws Exception {
		Thread.sleep(2000);
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[4]/div/div/div[1]/div[2]/div/div"));
		wb.click();
		Thread.sleep(2000);
	}

	@When("user click on priority button")
	public void user_click_on_priority_button() throws Exception {
		WebElement wb = driver
				.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[4]/div/div/div[1]/div[3]/div/div"));
		wb.click();
		Thread.sleep(2000);
	}

	@Then("browser is closed")
	public void browser_is_closed() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

}
