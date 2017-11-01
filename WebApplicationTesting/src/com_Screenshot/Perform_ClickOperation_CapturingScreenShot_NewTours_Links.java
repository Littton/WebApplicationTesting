package com_Screenshot;
 import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_ClickOperation_CapturingScreenShot_NewTours_Links {

	public static void main(String[] args) throws IOException {
		
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  //driver.get("http://facebook.com");
		  
		  driver.manage().window().maximize();
		  
		  List<WebElement>links= driver.findElements(By.tagName("a"));
		  
		  System.out.println(links.size());
		  
		  for(int i=0;i<links.size();i++)
		  {
		  String linkName=links.get(i).getText();
		  
		  String ExpectedURL=driver.findElement(By.linkText(linkName)).getAttribute("href");
		  
		  System.out.println(ExpectedURL);
		  
		  System.out.println(linkName);
		  
		  links.get(i).click();
		  
		 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(srcFile, new File("C:\\Users\\Fahima\\Desktop\\Selenium Class\\ScreenShots\\"+linkName+".png"));

		  System.out.println(driver.getTitle());
		  //System.out.println(driver.getCurrentUrl());
		  
		  String ActualUrl= driver.getCurrentUrl();
		  System.out.println(ActualUrl);
		  
		  if(ActualUrl.equals(ExpectedURL))
		  {
		   System.out.println("Reached to the WebPage Properly - PASS");
		  }
		  else
		  {
		   System.out.println("Reached to improper webPage - FAIL");
		  }
		  
		  
		 //File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//  FileUtils.copyFile(srcFile, new File("C:\\Users\\Fahima\\Desktop\\Selenium Class\\ScreenShots\\NewToursLinks.png"));

		  driver.navigate().back();
		  
		  links= driver.findElements(By.tagName("a"));
		  
		    
		  }
		  
		
		  driver.close();
		
		
	}

}
