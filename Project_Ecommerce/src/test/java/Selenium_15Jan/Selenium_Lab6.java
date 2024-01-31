package Selenium_15Jan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Lab6 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		
		
		WebElement ele = driver.findElement(By.linkText("Components"));
	
		Actions act =new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Monitors (2)")).click();
		

		Select product = new Select(driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
		product.selectByIndex(1);

		System.out.println("25 Quantity is Selected");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[2]/button[1]/i")).click();	
		
		js.executeScript("window.scrollBy(0,1000)");
		WebElement Radio=driver .findElement(By.id("input-option-value-6"));
		Radio.click();
		
		WebElement CheckBox=driver .findElement(By.id("input-option-value-9"));
		CheckBox.click();
		
	}

}
