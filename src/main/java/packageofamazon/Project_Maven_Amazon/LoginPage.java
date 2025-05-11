package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="auth-signin-button")
	WebElement signbutton;
	
	
	public void un() {
		username.sendKeys("vishnuts180@gmail.com");
	}
	
	public void continuebutton1() {
		continuebutton.click();
	}
	
	public void passwordbox() {
		password.sendKeys("Vishnu@123");
	}
	
	public void signinclick() {
		signbutton.click();
	}
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}



