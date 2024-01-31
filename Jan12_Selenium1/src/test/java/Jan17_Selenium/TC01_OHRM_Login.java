package Jan17_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Jan16_Selenium.OrangeHRM_POM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_OHRM_Login {

	public static void main(String[] args) throws IOException {
	InputStream input1 = new FileInputStream("C:\\Users\\shubham.gaikwad\\eclipse-workspace\\Jan12_Selenium1\\logindata.properties");
	Properties prob = new Properties();
	prob.load(input1);
	String url = prob.getProperty("url");
	System.out.println("The url is: "+url);
	
	
	File f1 = new File("C:\\Users\\shubham.gaikwad\\Downloads\\Untitled spreadsheet.xlsx");
	
	FileInputStream fis = new FileInputStream(f1);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet =workbook.getSheetAt(0);
	int rowcount = sheet.getPhysicalNumberOfRows();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			System.out.println("Row Count: "+rowcount);
			String [][] data = new String[2][2];
			for (int i=0;i<rowcount;i++)
			{
			
			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1]= sheet.getRow(i).getCell(1).getStringCellValue();
			String uname =data[i][0];
			String pword=data[i][1];
			System.out.println("username:"+uname);
			System.out.println("password:"+pword);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			try {
				
			OrangeHRM_POM obj = new OrangeHRM_POM(driver);
			obj.enterusername(uname);
			obj.enterpassword(pword);
			obj.clicklogin();
			
			
			} catch (NoSuchElementException e) {
				System.out.println("Element is Not Found: ");
			}
			}
	
}
}

