package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Login_Password {

	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		   driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login") ).click();
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
