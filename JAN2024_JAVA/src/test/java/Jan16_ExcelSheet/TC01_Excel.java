package Jan16_ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Jan16_Selenium.OrangeHRM_POM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\shubham.gaikwad\\Downloads\\Untitled spreadsheet.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
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
		/*		
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				ORHM_PageFactory obj = PageFactory.initElements(driver, ORHM_PageFactory.class);
				//OrangeHRM_POM obj = new OrangeHRM_POM(driver);
				obj.enterusername("Admin");
				obj.enterpassword("admin123");
				obj.clicklogin();
				
*/
	}

}
