package guru99;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

@Test
public void html() throws InterruptedException{
	
     System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
     WebDriver driver = new ChromeDriver();
    //driver object reference access all the built in function in selenium.
		
     driver.manage().window().maximize(); // maximizes window
	
     driver.get("http://techfios.com/test/?ng=login/");
     
     driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
     
     driver.findElement(By.id("password")).sendKeys("abc123");
     
     driver.findElement(By.name("login")).submit();
	
     
    driver.findElement(By.xpath("//i[@class='fa fa-database']")).click();
    
   driver.findElement(By.xpath("//a[@href='http://techfios.com/test/?ng=transactions/deposit/']")).click();
	
	
   driver.findElement(By.id("select2-account-container")).click();
   
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("checking"+ "\n");
   
   driver.findElement(By.id("date")).sendKeys("2022-10-06"+"\n");
   
   
   
   
   

	
}









}
