package Jan17_Selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12_DemoCart_Props {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream input1 = new FileInputStream("C:\\Users\\shubham.gaikwad\\eclipse-workspace\\Jan12_Selenium1\\lab12_democart.properties");
		Properties prop = new Properties();
		prop.load(input1);
		String url = prop.getProperty("url");
		System.out.println("The URL is: "+ url);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		LAB12_DemoCart_Pom obj = new LAB12_DemoCart_Pom(driver);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2("Mobile");
		obj.tick();
		obj.searchbutton();
	}

}
