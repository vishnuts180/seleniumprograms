package packageofamazon.Project_Maven_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement product1;
	
	public void productselection(WebDriver driver) throws InterruptedException {
		product1.click();
		Thread.sleep(2000);
		Set<String> window=driver.getWindowHandles();
		Iterator<String> i1=window.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
	}
	
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
