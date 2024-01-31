package Jan22;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_TC1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String  username, String password) throws InterruptedException {
	 
      Thread.sleep(3000);
      driver.findElement(By.name("username")).sendKeys(username);
      driver.findElement(By.name("password")).sendKeys(password);
      driver.findElement(By.tagName("button")).click();
      
      Thread.sleep(3000);
     boolean dashboard=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
    
     assertEquals(dashboard, true);  
	  
	 // System.out.println("This is the test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is Before Method");
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Shubham", "Shubham@123" },
    };
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
	  
	  System.out.println("This is Before Test");
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
