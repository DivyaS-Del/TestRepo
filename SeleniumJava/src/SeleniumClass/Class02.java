package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02 {

	public static void main(String[] args)throws Exception
	{
          WebDriver driver=new ChromeDriver();
          
		//open the facebook login page
		driver.get("https://facebook.com/login");

		// Maximize the window
       Thread.sleep(2000);
       driver.manage().window().maximize();
       
       //delete all cookies
       Thread.sleep(2000);
       driver.manage().deleteAllCookies();
       
       //open URL using navigate()method
       Thread.sleep(2000);
       driver.navigate().to("https://google.com/");
      
       //refresh the page
       Thread.sleep(2000);
       driver.navigate().refresh();
      
       //navigate to back
       Thread.sleep(2000);
       driver.navigate().back();
       
      //navigate to forward
       Thread.sleep(2000);
       driver.navigate().forward();
       
        //fetch current URL
       Thread.sleep(2000);
       System.out.println(driver.getCurrentUrl());
       
       //get title to print
       driver.navigate().back();
      System.out.println(driver.getTitle());
      
      //close the window
      driver.close();     
     
       
	}  

}
