package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title_Mercury_Tours {

	public static void main(String[] args) {
		 
		FirefoxDriver driver = new FirefoxDriver();
		  
		  driver.get("http://newtours.demoaut.com");
		  
		  String ExpectedTitle="Welcome: Mercury Tours";
		  
		  System.out.println(ExpectedTitle);
		  
		  System.out.println(driver.getTitle());
		  
		  String ActualTitle=driver.getTitle();
		  
		  if(ActualTitle.equals(ExpectedTitle))
		  {
		   System.out.println("Title Matched - PASS");
		  }
		  else
		  {
		   System.out.println("Title Not Matched - FAIL");
		  }

	}

}
