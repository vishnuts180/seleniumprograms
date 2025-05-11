package packageofamazon.Project_Maven_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Product1Page {
WebDriver driver;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement productwishlist;
	
	@FindBy(xpath="(//span[.='Continue shopping'])[1]")
	WebElement continueshopping;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(id="nav-cart-count-container")
	WebElement cart;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement cartincrement;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	WebElement proceedbuy;
	
	
	public void cart() {
		cart.click();
	}
	
	public void cartcount() {
		cartincrement.click();
		

	}
	
		public void buyproduct() {
			proceedbuy.click();
		
	}
	public void productaddtocart() {
		addtocart.click();
	}
	
	public void productwishlistadd() {
		productwishlist.click();
		
	}
	
	public void continueshopping() {
		continueshopping.click();
		
	}
	
	
	
	public Product1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}



