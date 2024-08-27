package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.util.TimeUtils;

public class Screenshot {

     WebDriver driver;
     //itestresult will provide us the test case execution status and test name
     
     public void captureScreenshot(ITestResult result) throws Exception {
    	 if(ITestResult.FAILURE==result.getStatus()) {
    
    		 // create ref of screenshot interface anf type casting
    		 TakesScreenshot ts= (TakesScreenshot)driver; // typecasting of 2 interface
    		 
    		 // use get a screenshotAs() to capture the screenshot in file format
    		 //getscreenshotAs()method return type=FILE
    		 
    		 File sourceFile=ts.getScreenshotAs(OutputType.FILE);
    		 
    		 // COPY THE FILE TO SPECIFIC LOCATION
    		 
    		 File destFolder= new File("./screenshots/"+result.getName()+ ".png");
    		 FileUtils.copyFile(sourceFile, destFolder);
    		System.out.println(result.getName()+"method()screenshot captured.");
    	 }
     
	}

}