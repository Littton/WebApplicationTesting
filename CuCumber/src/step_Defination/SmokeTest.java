package step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{
	 FirefoxDriver driver;
	 
	@Given ("^Open Firefox Browser and Navigate to Application$")
	public void Open_Firefox_Browser_and_Navigate_to_Application() throws Throwable {
	   
		  driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  driver.manage().window().maximize();
	}

	//@When("^User Enters Valid UserName and Password$")
	@When("^User Enters Valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_Enters_Valid_UserName_and_Password(String UserName, String Password) throws Throwable {
		  driver.findElement(By.name("userName")).sendKeys(UserName);
		  driver.findElement(By.name("password")).sendKeys(Password);
		  driver.findElement(By.name("login")).click();   
	}

	@Then("^User Should be able to logIn Successfully and close the Application$")
	public void User_Should_be_able_to_logIn_Successfully_and_close_the_Application() throws Throwable 
	{
		String ExpectedText = "Flight Finder to search";
		
		String ActualText= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
		
		if(ActualText.contains(ExpectedText))
		{
			System.out.println("LogIn Successful - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
		}
		  driver.close();
	}
	
	

}
