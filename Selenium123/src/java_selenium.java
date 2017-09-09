import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_selenium {

	@Test
	public void facebook() {
		// TODO Auto-generated method stub		   
           
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");		
		
		
	
	
	
	}

}
