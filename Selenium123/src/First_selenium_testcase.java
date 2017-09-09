import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_selenium_testcase {

	ChromeDriver driver;

@Before
public void setup()
{

	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
	
    //driver object reference access all the built in function in selenium.
		
     driver.manage().window().maximize(); // maximizes window
	
	

}
	
	
	@Test    //Junit annotation. It is a test runner and view test results
	public void test() throws InterruptedException{
		
		driver.get("http://www.qtptutorial.net/automation-practice/"); //get function helps us to go to the url
	
	
	 
	  //if (driver.findElement(By.id("idExample")).isDisplayed()){
	
	  //System.out.println("webpage is working");}
	 
	 //else 
		 //{System.out.println("webpage is not working");}
	
	 
	driver.findElement(By.id("idExample")).click(); // Identifies the ID element and click it
    
	 Thread.sleep(2000); // pause your test for two test
	 
	if ( driver.findElement(By.className("main_title")).isDisplayed())
		{System.out.println("first button is taking me to the web page");}
	else
	{System.out.println("first button is not working");}

	
	Thread.sleep(2000); // pause your test for two test
	
   driver.navigate().back(); // takes me to the back page
	
	
	driver.findElement(By.className("buttonClassExample")).click();
	
	if ( driver.findElement(By.className("main_title")).isDisplayed())
	{System.out.println("second button is taking me to the web page");}
   else
   {System.out.println("second button is not working");}	
	
	
	
	driver.navigate().back(); // takes me to the back page
	
	
	
	
	
	driver.findElement(By.name("NameExample")).click();
	
	if ( driver.findElement(By.className("main_title")).isDisplayed())
	{System.out.println("thrid button is taking me to the web page");}
   else
   {System.out.println("third button is not working");}	
	
	
	driver.navigate().back(); // takes me to the back page   
   
   
     

	}


	@Test
	public void Email() throws InterruptedException{
		
				
		
		driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("tom");
		
		driver.findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).sendKeys("tom");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("et_pb_signup_email")).sendKeys("tom@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("et_pb_newsletter_button_text")).click();
		
		Thread.sleep(2000);
		
			
		
		
		
	}
	
	
	
	
@After
public void cleanup()
{
	
	driver.close();
	driver.quit();


}










































	
	
	
	
	
	
	
	
	
	
	

}
