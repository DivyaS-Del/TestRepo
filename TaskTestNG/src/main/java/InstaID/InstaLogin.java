package InstaID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLogin {
	WebDriver driver;

	//@FindBy(id = "email")
	@FindBy(xpath="//input[@name='username']")
	WebElement emailField;

	//@FindBy(id = "pass")
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;

	//@FindBy(id = "loginbutton")
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div[3]/button")
	WebElement loginButton;

	public InstaLogin(WebDriver driver) {
		this.driver = driver;
		//pom--Page Object Model
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String email) {
		emailField.sendKeys(email);
	}

	public void setPassword(String pass) {
		passwordField.sendKeys(pass);
	}

	public void clickLogin() {
		loginButton.click();
	}

}
