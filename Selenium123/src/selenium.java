import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {

	@Test
	public void google() {
		// TODO Auto-generated method stub

		   
           
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

         

		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
		  
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("iphone");
		  searchBox.submit();
		
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}  // Let the user actually see something!
		  driver.quit();
		}

	@Test
	public void bing() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

        

		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.bing.com/");
		  
		  
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("iphone");
		  searchBox.submit();
		
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}  // Let the user actually see something!
		  driver.quit();
	

	}}


