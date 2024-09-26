package Goverment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GovtSD {
	WebDriver driver = null;

	@Given("the browser is open")
	public void the_browser_is_open() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\Divya2\\src\\test\\java\\Driver\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("the user launches the Karnataka-One web application")
	public void the_user_launches_the_karnataka_one_web_application() {
		driver.get("https://www.karnatakaone.gov.in/");
	}
	@When("the user click on delete cookies")
	public void the_user_click_on_delete_cookies() throws Exception {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"BTPModal\"]/div/div/button")).click();
	}

	@When("the user clicks on the English tab")
	public void the_user_clicks_on_the_english_tab() throws Exception {
		Thread.sleep(2000);
		WebElement english = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[9]/a"));
		english.click();
	}

	@When("the user clicks on the Kannada tab")
	public void the_user_clicks_on_the_kannada_tab() throws Exception {
		Thread.sleep(2000);
		WebElement Kannada = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[9]/a"));
		Kannada.click();
	}

	@When("the user clicks on the bengaluru tab")
	public void the_user_clicks_on_the_bengaluru_tab() throws Exception {
		Thread.sleep(2000);
		WebElement Bengaluru = driver.findElement(By.xpath("//*[@id=\"divCitySelected\"]"));
		Bengaluru.click();
	}

	@When("the user clicks on any item in the drop-down menu \\(e.g., Bagalkot)")
	public void the_user_clicks_on_any_item_in_the_drop_down_menu_e_g_bagalkot() throws Exception {
		Thread.sleep(2000);
		WebElement Bagalkot=driver.findElement(By.xpath("//*[@id=\"cities\"]/li[15]/a"));
		Bagalkot.click();
	}
	@Given("the user clicks on the Sign-In tab")
	public void the_user_clicks_on_the_sign_in_tab() throws Exception {
	    Thread.sleep(2000);
	    WebElement sign_in=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[1]/a"));
	    sign_in.click();
	}
	@When("the user clicks on the About Us tab")
	public void the_user_clicks_on_the_about_us_tab() throws Exception {
		Thread.sleep(2000);
		 WebElement about=driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a"));
		    about.click();
	}
	@When("the user clicks on any item in the drop-down menu \\(e.g.,About Karnataka One)")
	public void the_user_clicks_on_any_item_in_the_drop_down_menu_e_g_about_karnataka_one() {
		WebElement karnataka=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a/picture/img"));
		karnataka.click();
	}
	@When("the user clicks on the Online Services tab")
	public void the_user_clicks_on_the_online_services_tab() {
		WebElement service=driver.findElement(By.xpath("//*[@id=\"myCarousel\"]/div/div[15]/a/picture/img"));
		service.click();
		}
}
