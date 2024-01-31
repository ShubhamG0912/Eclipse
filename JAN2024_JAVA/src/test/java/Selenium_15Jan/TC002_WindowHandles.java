package Selenium_15Jan;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit Waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		System.out.println("Implicit Wait Executed");
		
		driver.get("https://letcode.in/windows");
		
		System.out.println(driver.getWindowHandle());
		
		//Conditional wait
		Thread.sleep(3000);
		
		//Explicit Waits
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.id("multi")));
		
		//driver.findElement(By.id("multi")).click();
		ele.click();
		System.out.println("Explicit Wait Executed");
		
		List<String> list1= new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Size: "+list1.size());
		
		for (int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			
		}
		
		driver.switchTo().window(list1.get(0));
		System.out.println("The URL is:  "+ driver.getCurrentUrl());
		
		driver.switchTo().window(list1.get(1));
		System.out.println("The URL is:  "+ driver.getCurrentUrl());
		
		driver.switchTo().window(list1.get(2));
		System.out.println("The URL is:  "+ driver.getCurrentUrl());
	}

}
