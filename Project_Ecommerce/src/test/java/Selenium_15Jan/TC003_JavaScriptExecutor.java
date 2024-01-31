package Selenium_15Jan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		//js.executeScript("alert('hello world');");
		
		//js.executeScript("window.scrollBy(0,documnet.body.scrollHeight)");

		js.executeScript("window.scrollBy(0,500)");
	}

}
