package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_RegisterLink_From_TheApplication {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("google.com');
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		
	//String ActualUrl=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		//String ExpectedURL=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		//System.out.println("ExpetedUrl");		
//driver.findElement(By.linkText("REGISTER")).click();
		
		  String ExpectedURL=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		  
		  System.out.println(ExpectedURL);
		  
		  driver.findElement(By.linkText("REGISTER")).click();
		  
		  String AcutalUrl= driver.getCurrentUrl();
		  
		  System.out.println(AcutalUrl);
		  
		  if(AcutalUrl.equals(ExpectedURL))
		  {
		   System.out.println("Reached to the WebPage Properly - PASS");
		  }
		  else
		  {
		   System.out.println("Reached to improper webPage - FAIL");
		  }
		 
		  driver.close();
		
	}

}
