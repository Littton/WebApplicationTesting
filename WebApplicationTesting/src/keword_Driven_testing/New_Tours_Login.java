package keword_Driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New_Tours_Login 

{
	FirefoxDriver driver;
@BeforeTest
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	
}
	@Test
	public void Login() throws IOException
	
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Fahima\\Desktop\\LittonSelenium\\WebApplicationTesting\\New_Tours_Home_Page.properties");
	
 Properties pr= new Properties();
 pr.load(file);
 FileInputStream  file1 = new   FileInputStream ("C:\\Users\\Fahima\\Desktop\\Selenium Class\\UserRegistrationTestData.xlsx");
 XSSFWorkbook wb = new
 XSSFWorkbook(file1);	  
 XSSFSheet ws = wb.getSheet("Sheet2");
 
int RowCount=  ws.getLastRowNum();
for(int i=1;i<=RowCount;i++)
{
	Row r= ws.getRow(i);
//String r =ws.getRow(i).getCell(i).getStringCellValue();
	
	driver.findElementByName(pr.getProperty("UserName")).sendKeys(r.getCell(0).getStringCellValue());
  driver.findElementByName(pr.getProperty("PWD")).sendKeys(r.getCell(1).getStringCellValue());
 driver.findElementByName(pr.getProperty("SingIn")).click();
 driver.navigate().back();	
	}

}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}