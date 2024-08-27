package SeleniumClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
	       driver.get("https://google.com");
			
		   //implicit wait
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	       driver.findElement(By.id("APjFqb")).sendKeys("How Stuff Works");
	       
	       //Handling Auto Suggestion
	      List<WebElement> divya = driver.findElements(By.id("APjFqb")); 
	      for(int i=0; i<divya.size();i++)
	      {
	    	  String expResult="How stuff works quiz";
	    	  if(divya.get(i).getText().equalsIgnoreCase(expResult)) {
	    		  divya.get(i).click();
	    		  break;
	    	  }
	      }
	}

}
