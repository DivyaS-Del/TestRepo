package SeleniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",":D\\DatajavaWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("document,getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document,getElementById('pass').value='1234abc'");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400,)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400,)");
		
		
	}

}
