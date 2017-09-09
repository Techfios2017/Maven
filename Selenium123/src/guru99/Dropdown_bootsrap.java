package guru99;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_bootsrap {
	@Test
	public void html() throws InterruptedException{
		
	     System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
		
	     WebDriver driver = new ChromeDriver();
	    			
	     driver.manage().window().maximize(); // maximizes window
		
	        
	      driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	  
	       //clicking tutorial button	 
	      driver.findElement(By.xpath(".//*[@id='menu1']")).click(); 
	 
	       Thread.sleep(2000); 	 
	 
	      //capturing dropdown 
	
	       List<WebElement> dd_menu=driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));
	       // We are using enhanced for loop to get the elements	 
	       
	       
	       
	       
	      //store all the webelements of xpath and from their print all the innerhtml
	       
	       
	       for (int i=0; i<dd_menu.size();i++)	 
	       {	 
	          // for every elements it will print the name using innerHTML
	 
	    	   WebElement element=dd_menu.get(i);
 
	    	   //from the all the html just select the innerHTML and print innerHTML
	    	   String innerhtml=element.getAttribute("innerHTML");
	    	   
	    	   System.out.println(innerhtml);
	
	       
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   // Here we will verify if link (item) is equal to Java Script
	         
	          if (element.getAttribute("innerHTML").contains("JavaScript")) {
	 
	             // if yes then click on link (iteam)
	 
	             element.click();	 
	             // break the loop or come out of loop	 
	             break;
	 	          }
	 
	       }
	 
	       // here you can write rest piece of code	       
	       }

	
		@Test
		public void dropdown_techfios() throws InterruptedException{
			
		     System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
			
		     WebDriver driver = new ChromeDriver();
		    //driver object reference access all the built in function in selenium.
				
		     driver.manage().window().maximize(); // maximizes window
			
		     // start the application
		     
		     driver.get("http://techfios.com/test/?ng=login/");
		     
		     driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		     
		     driver.findElement(By.id("password")).sendKeys("abc123");
		     
		     driver.findElement(By.name("login")).submit();
			
		     
		    driver.findElement(By.xpath("//i[@class='fa fa-database']")).click();
		    
		   driver.findElement(By.xpath("//a[@href='http://techfios.com/test/?ng=transactions/deposit/']")).click();
		 
		       // adding 2 seconds wait to avoid Sync issue
		 
		       Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(".//*[@id='select2-account-container']")).click();
		 
		       // Dropdown items are coming in <a> tag so below xpath will get all
		 
		       // elements and findElements will return list of WebElements
		 
		     
		 List<WebElement> dd_menu=driver.findElements(By.xpath(".//*[@id='select2-account-results']"));
		 
		 
		       // We are using enhanced for loop to get the elements
		 
		       for (int i=0; i<dd_menu.size();i++)
		 
		       {
		 
		          // for every elements it will print the name using innerHTML
		 
		    	   WebElement element=dd_menu.get(i);

		    	   String innerhtml=element.getAttribute("innerHTML");
		    	   
		    	   System.out.println(innerhtml);
		
		       // Here we will verify if link (item) is equal to Java Script
		         /*
		          if (element.getAttribute("innerHTML").contains("checking")) {
		 
		             // if yes then click on link (item)
		 
		             element.click();
		 
		 
		 
		             // break the loop or come out of loop
		 
		             break;
		 
		          }
		 */
		       }
		 
		       // here you can write rest piece of code
		         
		            
		       
		       
		       
		       }


}
	

