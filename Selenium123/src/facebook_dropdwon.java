import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_dropdwon {

@Test
public void facbook(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
    WebDriver driver = new ChromeDriver();
   //driver object reference access all the built in function in selenium.
		
    driver.manage().window().maximize(); // maximizes window
	
    driver.get("https://www.facebook.com/");
	
	WebElement date =driver.findElement(By.id("month"));
	
  
	
	
	
}







}
