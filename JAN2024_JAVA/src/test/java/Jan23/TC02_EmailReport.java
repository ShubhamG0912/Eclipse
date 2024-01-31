package Jan23;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TC02_EmailReport {
	WebDriver driver;
	@Test(dataProvider = "dp")
	public void f(String uname, String pwd) throws Exception  {	
		long timestamp = new Date().getTime();
		System.out.println("Time is"+ timestamp);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			OHRM_POM_Props obj = new OHRM_POM_Props(driver);
			
			String title = driver.getTitle();
			Assert.assertEquals(title, "OrangeHRM"); //Using 'orangeHRM' to forcefully fail the Test Case
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("23rdJan2024[3].html");
			extent.attachReporter(spark);
			ExtentTest test = extent.createTest("Verify the Title of OrangeHRM");
			if(title.equals("orangeHRM"))
			{
				test.pass("OrangeHRM title is displayed");
				
			}
			else
			{
				Thread.sleep(3000);
				File sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				File dfile=new File("img1.png");
				FileUtils.copyFile(sfile, dfile);
				String path= dfile.getAbsolutePath();
				test.fail("OrangeHRM title is not displayed"
						,MediaEntityBuilder
						.createScreenCaptureFromPath(path)
						.build());
				test.addScreenCaptureFromPath(path);
				
			}
			
			
			obj.enterusername(uname);
			obj.enterpassword(pwd);
			obj.clickButton();
			
			extent.flush();
			 boolean dashboard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]")).isDisplayed();
				System.out.println("Dashboard"+dashboard);
				assertEquals(dashboard, true);
				
	}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		  
		 System.out.println("This is before method");
		 InputStream input1 = new FileInputStream("C:\\Users\\shubham.gaikwad\\eclipse-workspace\\JAN2024_JAVA\\src\\test\\java\\Jan23\\file.properties");
			Properties prob = new Properties();
			prob.load(input1);
		
			String url = prob.getProperty("url");
		//	driver.manage().window().maximize();
			System.out.println("The URL is:" + url);
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get(url);
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
	}

	@AfterMethod
	public void afterMethod() {
		  System.out.println("This is after method");
		  driver.quit();
	}

	@DataProvider
	public Object[][] dp() throws Exception {
		  File f1 = new File("C:\\Users\\shubham.gaikwad\\Desktop\\CodeMap\\DotNet\\DataOHRM.xlsx");
	 
	    
	    FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[2][2];
			 
			for(int i=0;i<rowCount;i++) {
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				String uname = data[i][0];
				String pwd = data[i][1];
				System.out.println("Username: "+uname);
				System.out.println("Password: "+pwd);
				 
			}
			return data;
	  };

	@BeforeClass
	public void beforeClass() {
		  System.out.println("This is before class");
	}

	@AfterClass
	public void afterClass() {
		  System.out.println("This is after class");
	}

	@BeforeTest
	public void beforeTest() {
		  System.out.println("This is before test");
	}

	@AfterTest
	public void afterTest() {
		  System.out.println("This is after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		  System.out.println("This is before suite");
	}


	@AfterSuite
	public void afterSuite() {
		  System.out.println("This is after suite");
	}

	}



