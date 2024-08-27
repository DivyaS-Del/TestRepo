package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class07 {
	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.facebook.com/");

	}

	@DataProvider
	public Object[][] dataSet() throws Exception {

		// Specify the location of property file
		File src3 = new File("C:\\Users\\Sharath_TP\\eclipse-workspace\\SeleniumJava\\Repository\\testdata.property");

		// create FileInputStream class object to load the file
		FileInputStream fis3 = new FileInputStream(src3);

		// create properties classmobject to read properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
		Object arr[][] = new Object[3][2];
		arr[0][0] = pro3.getProperty("TestData1");
		arr[0][1] = pro3.getProperty("TestData2");
		arr[1][0] = "TestData2";
		arr[1][1] = "TestData2";
		arr[2][0] = "TestData3";
		arr[2][1] = "TestData3";
		arr[0][0] = pro3.getProperty("TestData1");
		arr[0][1] = pro3.getProperty("TestData2");
		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterData(String userName, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
