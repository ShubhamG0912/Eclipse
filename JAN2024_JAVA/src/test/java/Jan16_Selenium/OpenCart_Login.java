package Jan16_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Desktops']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']")).click();
		
		Select s1 = new Select(driver.findElement(By.id("input-sort")));
		s1.selectByIndex(1);
		

		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[2]/button[1]/i")).click();	
		
		
		
	}

}
