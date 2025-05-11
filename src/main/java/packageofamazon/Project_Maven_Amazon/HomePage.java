package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtf;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountantlist_hover;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin_home;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement logout;
	
	public void logout() {
		logout.click();
	}
	public void searching() {
		searchtf.sendKeys("shoe"+Keys.ENTER);
	}
	public void hoverover(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(accountantlist_hover).perform();
	}
	
	public void signin() {
		signin_home.click();
	}
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
