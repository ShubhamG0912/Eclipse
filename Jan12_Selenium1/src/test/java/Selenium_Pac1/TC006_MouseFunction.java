package Selenium_Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_MouseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		
		System.out.println("Verify MyAccount: "+ driver.findElement(By.linkText("My Account")).isDisplayed());
		
		System.out.println("Text is My Account is "+ driver.findElement(By.linkText("My Account")).getText());
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys("Radhe@gmail.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("P@ssw0rd##1234");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		
		act.perform();
	}

}
