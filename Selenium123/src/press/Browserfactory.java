package press;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {

	static WebDriver driver;
	
	public static void setup()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); 		
	    driver.manage().window().maximize(); 	
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		
		
		
	}

public static void cleanup()

{
	driver.close();
	driver.quit();


}






}
