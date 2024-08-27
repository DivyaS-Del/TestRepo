package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Alert {
	public static void main(String args[])throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		// Alert Hndling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		
		// verify alert text
		Thread.sleep(2000);
		String alertText=driver.switchTo().alert().getText();
		String expAlterText="do you confirm action?";
		Assert.assertEquals(alertText, expAlterText);
		System.out.println("Alert text verified");
		
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		
	
		//Dismiss the alert
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");
		
	}
	

}
