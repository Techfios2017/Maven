import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Press_dry {

@Test
public void login() throws InterruptedException

{
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
	WebDriver driver = new ChromeDriver(); // Object that enables to open the chromedriver.	
	
	driver.manage().window().maximize(); 
	
	driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
	
    
     driver.findElement(By.id("menu1")).click();
         
      
     
    List <WebElement> type_account=driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));
    
    for (int i=0; i<type_account.size();i++)
    {
    	WebElement element=type_account.get(i);
    	
    	
    	String innerhtml=element.getAttribute("innerHTML");
    	System.out.println(innerhtml);
    	
    if (innerhtml.contentEquals("HTML"));
    {
    element.click();
    }
    
    
    
    driver.close();
    driver.quit();
    
    
    
    
    
    
    }
    	
    
  

   
   
   
   
	
	
    
      



}

//how to select drop down for "select" elements
@Test
public void facebook()
{
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
	WebDriver driver = new ChromeDriver(); // Object that enables to open the chromedriver.	
	
	driver.manage().window().maximize(); 

	driver.get("https://www.facebook.com/");
	
	
	 WebElement type_account= driver.findElement(By.id("month")); 
	         
	   
	    Select x= new Select(type_account);    	//we are creating an object and passing the variable type_account
	                                             // Select statement is saying to select all the elements from this variable
	    
	    
	   x.selectByVisibleText("Jan"); // selecting by text
	  // x.selectByIndex(6); //selecting by text
	   x.selectByValue("6");


}




}
