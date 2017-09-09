import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	@Test
	public void Email() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
		
		WebDriver driver = new ChromeDriver(); // Object that enables to open the chromedriver.	
		
		driver.manage().window().maximize(); 
		
		driver.get("http://www.qtptutorial.net/automation-practice/");
		/*
		//identified by using xpath
		driver.findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).sendKeys("tom");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("et_pb_signup_email")).sendKeys("tom@gmail.com");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.className("et_pb_newsletter_button_text")).click();
		driver.findElement(By.xpath("//a[@class='et_pb_newsletter_button']")).click();
		
		*/
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}
	










}
