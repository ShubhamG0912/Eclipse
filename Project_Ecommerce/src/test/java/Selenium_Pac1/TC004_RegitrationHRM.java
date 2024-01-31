package Selenium_Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_RegitrationHRM {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.linkText("My Account")).click();
        
        Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		
		//driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("Vijay");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Sharma");
		
		driver.findElement(By.id("input-email")).sendKeys("VijaySharma@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("VijayS@123");
		
		Thread.sleep(2000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	js.executeScript("window.scrollBy(0,850)", ""); 
	
		driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
		
          driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Thank You for Registration");
		
		

	}

}
