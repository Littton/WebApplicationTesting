package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title_and_Url_Mercury_Tours {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		  
		  driver.get("http://newtours.demoaut.com");
		  
		  String ExpectedTitle="Welcome: Mercury Tours";
		  String ExpectedUrl="newtours.demoaut.com";
		  
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

}


	


