package press;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	
static WebDriver driver;

static By title=By.id("title");
static By content=By.id("content");
static By publish=By.id("publish");


public Home(WebDriver driver)

{
	Home.driver=driver;

}


public void typetitle()
{

	driver.findElement(title).sendKeys("hello");


}


public static void typecontent()
{
	driver.findElement(content).sendKeys("this is just a test");
	
	

}



public static void clickpublish()
{

	driver.findElement(publish).click();

}



}
