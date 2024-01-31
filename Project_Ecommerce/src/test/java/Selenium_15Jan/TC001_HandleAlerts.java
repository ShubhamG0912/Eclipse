package Selenium_15Jan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_HandleAlerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		
		//Accept alert
		driver.findElement(By.id("accept")).click();
		Alert simplealert= driver.switchTo().alert();	
		System.out.println(simplealert.getText());
		simplealert.accept();
	
		//Confirm Alert
	driver.findElement(By.id("confirm")).click();
	Alert confirmalert= driver.switchTo().alert();	
	System.out.println(confirmalert.getText());
	confirmalert.accept();
	
	
	//Prompt Alert
	
driver.findElement(By.id("prompt")).click();
Alert promptalert= driver.switchTo().alert();	
System.out.println(promptalert.getText());
promptalert.sendKeys("Hi This is Shubham");
promptalert.accept();
System.out.println("Prompt Alert Executed");

		

	}

}
