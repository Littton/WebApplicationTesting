package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class New_Tours_HomePage_Testing 
{
@Test
public void HomePageTesting()
{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	
	   
	WelComeMercury_Tours WMT = PageFactory.initElements(driver,WelComeMercury_Tours.class);
	
	WMT.Singoff();
	driver.navigate().back();
	
	WMT.Register();
	driver.navigate().back();

	WMT.Support();

	driver.navigate().back();

	WMT.LogIn("tutorial", "tutorial");
}
	

}
