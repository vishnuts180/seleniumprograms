package packageofamazon.Project_Maven_Amazon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void logintoamazon_search_logout() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		HomePage h1=new HomePage(driver);
		h1.hoverover(driver);
		h1.signin();
		LoginPage l1=new LoginPage(driver);
		l1.un();
		l1.continuebutton1();
		l1.passwordbox();
		l1.signinclick();
		h1.searching();
		h1.hoverover(driver);
		h1.logout();
	}
	

}

