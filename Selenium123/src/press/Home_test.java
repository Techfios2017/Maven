package press;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_test  {

@Test
public void post()
{
	

	    System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 		
	    driver.manage().window().maximize(); 	
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		Page l=new Page(driver);
		l.logintopress();
		
		
		
		
		
		Home h= new Home(driver);
		h.typetitle();
		h.typecontent();
		h.clickpublish();
		
		
		driver.close();
		driver.quit();




}







}
