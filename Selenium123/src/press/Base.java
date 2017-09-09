package press;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	
public WebDriver setup()

{
	 System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 		
	    driver.manage().window().maximize(); 	
		driver.get("http://demosite.center/wordpress/wp-login.php");
		return driver;	
	
}


	public void closeapplication()

	{
		driver.close();
		driver.quit();
	}





}
