package Selenium_Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("RushiKhushi@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("RushichiKhushi");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		System.out.println("Login Successfully");
		driver.quit();
	}

}
