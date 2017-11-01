package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_Xpath_For_All {

	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		   driver.get("http://newtours.demoaut.com");
		   driver.manage().window().maximize();
		
	//	driver.findElement(By.name("userName")).sendKeys("tutorial");
	//	driver.findElement(By.name("password")).sendKeys("tutorial");
	//	driver.findElement(By.name("login") ).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("tutorial");
	    driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("tutorial");
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input") ).click();
				
		   //newtours.demoaut.com/mercuryreservation.php
		//Find a Flight: Mercury Tours:
		String ExpectedTitle="Find a Flight: Mercury Tours:";
		  String ExpectedUrl="newtours.demoaut.com/mercuryreservation.php";
		  
		  System.out.println(ExpectedTitle);
		  System.out.println(driver.getTitle());
		  String ActualTitle=driver.getTitle();
		  
		  System.out.println(ExpectedUrl);
		  String ActualUrl=driver.getCurrentUrl();
		  System.out.println(ActualUrl);
		  
		  // validating Title
		  if(ActualTitle.equals(ExpectedTitle))
		  {
		   System.out.println("Title Matched - PASS");
		  }
		  else
		  {
		   System.out.println("Title Not Matched - FAIL");
		  }
		  
		  // validating CurrentUrl
		  if(ActualUrl.contains(ExpectedUrl))
		  {
		   System.out.println("URL Matched - PASS");
		  }
		  else
		  {
		   System.out.println("URL Not Matched - FAIL");
		  }
		  
		  
		  driver.close();
	      
	      

	}

	/*private static By By(String string) {
		// TODO Auto-generated method stub
		return null;
	}
*/
} 
