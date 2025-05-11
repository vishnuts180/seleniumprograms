package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit{
	
	@Test
	public void login_search_wishlist_cart_logout() throws InterruptedException {
	
	
	HomePage h1=new HomePage(driver);
	h1.hoverover(driver);
	h1.signin();
	LoginPage l1=new LoginPage(driver);
	l1.un();
	l1.continuebutton1();
	l1.passwordbox();
	l1.signinclick();
	h1.searching();
	
	SearchResultPage searchpage=new SearchResultPage(driver);
	searchpage.productselection(driver);
	
	Product1Page prod1page=new Product1Page(driver);
	prod1page.productwishlistadd();
	prod1page.continueshopping();
	Thread.sleep(2000);
	prod1page.productaddtocart();
	
	Thread.sleep(2000);
	prod1page.cart();
	Thread.sleep(2000);
	prod1page.cartcount();
	Thread.sleep(2000);
	prod1page.buyproduct();
	//h1.hoverover(driver);
	//h1.logout();

}
}