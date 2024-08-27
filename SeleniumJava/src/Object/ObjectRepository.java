package Object;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		File src1 = new File("C:\\Users\\Sharath_TP\\eclipse-workspace\\SeleniumJava\\Repository\\Config.property");
		File src2 = new File("C:\\Users\\Sharath_TP\\eclipse-workspace\\SeleniumJava\\Repository\\locators.property");
		File src3 = new File("C:\\Users\\Sharath_TP\\eclipse-workspace\\SeleniumJava\\Repository\\testdata.property");

		// create a file inputstream class object to load the file

		FileInputStream Fis1 = new FileInputStream(src1);
		FileInputStream Fis2 = new FileInputStream(src2);
		FileInputStream Fis3 = new FileInputStream(src3);

		// create a propertied class object to read property file
		Properties pro1 = new Properties();
		pro1.load(Fis1);
		Properties pro2 = new Properties();
		pro2.load(Fis2);
		Properties pro3 = new Properties();
		pro3.load(Fis3);

		// setting the property of chrome browser and passing chrome driver path

		// System.setProperties("weddriver.chrome.driver","C:\\Program Files
		// (x86)\\Google\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));

		// getproperty method will accept key and return value of that key

		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		Thread.sleep(2000);
		driver.close();

	}
}