package SeleniumClass;
import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging  {

	public static void main(String[] args) throws Exception {

    //create logger instance
		Logger logger=Logger.getLogger("Log4JLogging");
		
		//configure log4j property file
		PropertyConfigurator.configure("C:\\Users\\Sharath_TP\\eclipse-workspace\\SeleniumJava\\log4j.properties");
		
		//open browser instance
		//System.setProperty("webdriver.chrome.driver",":D\\DatajavaWorkspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("chrome browser instance opened");
		
		//maximise the window
		driver.manage().window().maximize();
		logger.info("window maximised");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 logger.info("implicit given");
		 
		 //open URL
		 driver.get("https://www.facebook.com/");
		 logger.info("Application opened");
		 
		 //check if the webelement is displayed or not
		 
		 try {
			 driver.findElement(By.id("emails")).isDisplayed();
			 logger.info("web element displayed");
			 
		 }catch (Exception e) {
			 logger.info("Failure - 'emails' web element is not displayed");
			 
		 }
		 		
		
		
	}

}