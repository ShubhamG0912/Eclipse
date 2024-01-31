package Jan16_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_POM {
	WebDriver driver;
	
	By uname = By.name("username");
	By pword = By.name("password");
	By loginbutton= By.xpath("//button[@type='submit']");
	
	public OrangeHRM_POM(WebDriver driver2)
	{
		this.driver =driver2;
	}
	public void enterusername(String username1)
	{
		driver.findElement(uname).sendKeys(username1);
		
	}
	
	public void enterpassword(String passsword1)
	{
		driver.findElement(pword).sendKeys(passsword1);
		
	}
	
	public void clicklogin() 
	{
		driver.findElement(loginbutton).click();
	}

}
