package InstaID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InstaTest {
WebDriver driver;
	
	@BeforeClass
	public void set() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sharath_TP\\eclipse-workspace\\TestNG\\src\\test\\java\\Driver\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en"
		+ "");
	}
	
	@Test
	public void testLogin() throws Exception {
		InstaLogin p1 = new InstaLogin(driver);
		Thread.sleep(2000);
		p1.setUsername("miss@gmail.com");
		p1.setPassword("12345678");
		p1.clickLogin();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
