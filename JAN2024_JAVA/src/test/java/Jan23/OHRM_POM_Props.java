package Jan23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRM_POM_Props {
WebDriver driver;
	
	By uname=By.name("username");
	By pwd=By.name("password");
	By loginButton=By.xpath("//button[@type='submit']");
	
	public OHRM_POM_Props(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public void enterusername(String username1) {
		driver.findElement(uname).sendKeys(username1);
	}
	
	public void enterpassword(String password1) {
		driver.findElement(pwd).sendKeys(password1);
	}
	
	public void clickButton() {
		driver.findElement(loginButton).click();
	}

	public boolean verifyusername() {
		// TODO Auto-generated method stub
		return false;
	}

}

