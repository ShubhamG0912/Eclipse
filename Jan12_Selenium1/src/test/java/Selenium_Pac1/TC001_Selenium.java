package Selenium_Pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title of Current WebPage: " +driver.getTitle());
		
		WebElement search = driver.findElement((By.id("APjFqb")));
		search.sendKeys("Automation tesing tools");
		search.submit();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("After backward: "+ driver.getTitle());
		System.out.println("Page Source: "+driver.getCurrentUrl());
		System.out.println("Pae Source: "+ driver.getPageSource().contains("Amazon"));
		
		
		driver.navigate().forward();
		System.out.println("After forward: "+ driver.getTitle());
		
		driver.quit();
		
		//driver.close();
	}

}
