package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshot02 {
	Screenshot sc=new Screenshot();
	@Test
	public void doLogin() throws Exception {
	sc.driver=new ChromeDriver();
	sc.driver.manage().window().maximize();
	sc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	sc.driver.get("https:/www.facebook.com/");
	Thread.sleep(2000);
	sc.driver.findElement(By.id("email")).sendKeys("sdsad23@gmail.com");
	sc.driver.findElement(By.id("pass")).sendKeys("232asdd");
	
	// pass wrong id so that test case will fail
	
	sc.driver.findElement(By.id("email_wrong")).sendKeys("sdsad23@gmail.com");
	
	
	}
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
	sc.captureScreenshot(result2);
}
}