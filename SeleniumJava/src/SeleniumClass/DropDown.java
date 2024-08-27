package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		// open the facebook login page
		driver.get("https://facebook.com/login");

		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'u_0_0')]")).click();
//1st way
        Thread.sleep(2000);
		List<WebElement> BirthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("total no of dropdown: " + BirthMonth.size());
		BirthMonth.get(8).click();// sep

//2nd way
		Thread.sleep(2000);
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select Month = new Select(bm);
		Thread.sleep(2000);
		Month.selectByVisibleText("Apr");// apr
		Thread.sleep(2000);
		Month.selectByValue("12"); // dec
		Thread.sleep(2000);
		Month.selectByIndex(7); // aug

		System.out.println(Month.getFirstSelectedOption().getText());// Aug-------->Cuurent selected value or month
		// 3rd way
         Thread.sleep(2000);
		List<WebElement> dropdown = Month.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("sep")) {
				dropdown.get(i).click();
			}
		}
		// 4th way
		
		bm.sendKeys("jun");

		// 5th way
	
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

		// check if dropdown support multi selection
		Thread.sleep(2000);
		System.out.println(Month.isMultiple());
		Month.selectByVisibleText("Apr");// apr
		Month.selectByValue("12"); // dec
		Month.selectByIndex(7); // aug

		/*
		 * // deselect the multi selected values //Thread.sleep(2000);
		 * Month.deselectByVisibleText("Appr");// apr Month.deselectByValue("12"); //
		 * dec Month.deselectByIndex(7); // aug Month.deselectAll();// deselect all
		 * selected values
		 */
	}
}
