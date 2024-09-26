package Rubix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RubixLogin {
	WebDriver driver;

	public void desiredplatform() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
}
	public void launchesapplication() {
		
		driver.findElement(By.xpath("//*[contains(@role,'com')]")).sendKeys("https://rubixe.com/",Keys.ENTER);
	}
	
	public void opensuccessfully() {
		System.out.println("open successfully");
	}
}