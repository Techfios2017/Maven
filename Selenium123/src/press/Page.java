package press;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends Base{

//WebDriver driver;

//By username=By.xpath("//input[@id='user_login']");
By username=By.id("user_login");
By password=By.id("user_pass");
By loginbutton=By.id("wp-submit");

public Page(WebDriver driver)

{
	this.driver=driver;

}

public void typeusername() 
{

driver.findElement(By.id("user_login")).sendKeys("admin");


}

public void typepassword()

{
	
driver.findElement(password).sendKeys("demo123");

}



public void clicklogin()
{

	driver.findElement(loginbutton).click();

}



public void logintopress()
{

	typeusername();
	typepassword();
	clicklogin();


}





}
