package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login {
	WebDriver driver;
	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	}

	@When("User opens the url")
	public void user_opens_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	@And("User enter the username and password")
	public void user_enter_the_username_and_password() throws InterruptedException {
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("Click on login button")
	public void click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("Home page should be dispalyed")
	public void home_page_should_be_dispalyed() throws InterruptedException {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		boolean dashboard= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		
		if(dashboard)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Unsuccessful");
		}	
		
	}
}
