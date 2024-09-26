package InstaID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Lavatestng {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
			//WebElement search = driver.findElement(By.xpath("//*[@type=\"text\"]"));
			//search.sendKeys("mobiles");
			driver.findElement(By.xpath("//*[@aria-label=\"Mobiles\"]")).click();
			Thread.sleep(3000);
			   driver.findElement(By.xpath("//*[@class=\"TSD49J\"][4]")).click();
			   Thread.sleep(3000);
			WebElement saree = driver.findElement(By.xpath(" //*[@title=\"Sarees\"]"));
			      saree.click();
			      Thread.sleep(4000);
			      driver.findElement(By.xpath("(//*[@class=\"_53J4C-\"])[2]")).click();
			      
			
			
			
			

	}
	

}
