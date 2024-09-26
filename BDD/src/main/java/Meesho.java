import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) {
		WebDriver driver;


			driver = new ChromeDriver();
			driver.manage().window().maximize();
	
			driver.get("https://supplier.meesho.com/panel/v3/new/root/login");
		}

	}


