package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Jan24.ORHM_POM;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_login {
	@Given("STart the browser")
	public void STart_the_browser() throws Exception {
		WebDriver driver;
		

		InputStream input1 = new FileInputStream("C:\\Users\\shubham.gaikwad\\eclipse-workspace\\JAN2024_JAVA\\src\\test\\java\\Jan23\\file.properties");
		Properties prob = new Properties();
		prob.load(input1);
		String url = prob.getProperty("url");
		System.out.println("The URL is:" + url);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  long timestamp = new Date().getTime();
		  File f1 = new File("C:\\Users\\shubham.gaikwad\\Desktop\\CodeMap\\DotNet\\DataOHRM.xlsx");
	      FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[2][2];
			
			for(int i=0;i<rowCount;i++) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url);
				
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				String uname = data[i][0];
				String pwd = data[i][1];
				System.out.println("Username: "+uname);
				System.out.println("Password: "+pwd);	
		  
				ORHM_POM obj = new ORHM_POM(driver);
		  String title=driver.getTitle();
		  //Assert.assertEquals(title, "OrangeHRM");
		  
		  ExtentReports extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"Jan25.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the Title of OrngeHRM");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				  
			obj.enterusername(uname);
			obj.enterpassword(pwd);
			obj.clickButton();


				if(obj.verifylogin())
				{
					System.out.println("Login Succeful ");	
				}
				else
				{
					System.out.println("Login Unsuccessful");
				}
		driver.quit();
			}
		}
	}


