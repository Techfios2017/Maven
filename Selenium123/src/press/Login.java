package press;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Login extends Base  {

	Page page;
	//Home home;
	
	//public WebDriver Driver; 
	
	
@Test
public void publish()
{
   // System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");	
	//WebDriver driver = new ChromeDriver(); 		
    //driver.manage().window().maximize(); 	
	//driver.get("http://demosite.center/wordpress/wp-login.php");
	
	
	//Page l=new Page(driver);
	//l.typeusername();
	//l.typepassword();
	//l.clicklogin();
	
	
	
	
	
	
	
	page =new Page(driver);
	page.logintopress();
	
	
	
	//home=new Home(driver);
	//home.typetitle();
	
	
}






}
