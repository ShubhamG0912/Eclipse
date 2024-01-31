package Jan22;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_lab3 {
	WebDriver driver;
  @BeforeMethod
  public void LaunchTheBrowser() {
	  
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://demo.opencart.com/");
      System.out.println("This is Before Method");
  }

  @AfterMethod
  public void CloseTheBrowser() {
	  
	  driver.quit();
	  System.out.println("This is After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
	  
	  
  }
  @Test
  public void Test() throws InterruptedException {
	  driver.findElement(By.xpath("//a[normalize-space()='Desktops']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']")).click();
		
		Select s1 = new Select(driver.findElement(By.id("input-sort")));
		s1.selectByIndex(1);
		

		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[2]/button[1]/i")).click();
	  System.out.println("The Item 'Add to Cart' Successfully ");
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("This is After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is Before Suite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is After Suite");
  }

}
