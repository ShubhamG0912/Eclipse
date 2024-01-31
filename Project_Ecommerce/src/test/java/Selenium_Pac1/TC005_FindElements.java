package Selenium_Pac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Register")).click();
		
		List<WebElement> l1= driver.findElements(By.xpath("//input[@class='form-control']"));
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getAttribute("name"));
			System.out.println(l1.get(i).getAttribute("id"));
		}
	}

}
