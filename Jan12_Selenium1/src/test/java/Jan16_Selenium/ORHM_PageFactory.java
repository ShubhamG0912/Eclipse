package Jan16_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ORHM_PageFactory {
	
	WebDriver driver;
	
	@FindBy(name= "username")
	WebElement uname;
	
	@FindBy (name="password")
	WebElement pword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	public void enterusername(String username1)
	{
	uname.sendKeys(username1);
		
	}
	
	public void enterpassword(String passsword1)
	{
		pword.sendKeys(passsword1);
		
	}
	
	public void clicklogin() 
	{
		loginbutton.click();
	}


}
