package Jan17_Selenium;

import java.io.File;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC02_OHRM_Login_xml {

	public static void main(String[] args) throws Exception {
		File xmlFile = new File("C:\\Users\\shubham.gaikwad\\eclipse-workspace\\Jan12_Selenium1\\loginCss.xml");
		DocumentBuilderFactory DBfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = DBfactory.newDocumentBuilder();
		 Document doc = dbuilder.parse(xmlFile);
		 NodeList n1 = doc.getChildNodes();
		 Node n = n1.item(0);
		 Element ele = (Element)n;
		 String usern = ele.getElementsByTagName("username").item(0).getTextContent();
		 String pass = ele.getElementsByTagName("password").item(0).getTextContent();
		 String logbtn = ele.getElementsByTagName("loginbtn").item(0).getTextContent();
		 System.out.println("Username: "+usern);
		 System.out.println("Password: "+pass);
		 
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name(usern)).sendKeys("Admin");   //by using xpath
		driver.findElement(By.name(pass)).sendKeys("admin123");
		driver.findElement(By.xpath(logbtn)).submit();
		}
	}


