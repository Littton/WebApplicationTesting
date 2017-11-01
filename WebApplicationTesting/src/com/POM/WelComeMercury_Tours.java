package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercury_Tours 

{
	 // WebElement singOff= driver.findElement(By.linkText("SIGN-OFF"));
	 
	// @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	@FindBy(linkText="SIGN_OFF")
	WebElement singoff;
	
  public void Singoff()
  {
	  singoff.click();
  }
  
  @FindBy(linkText="REGISTER" )
  WebElement register;
  public void Register()
  {
	  register.click();
  }
  @FindBy(linkText="SUPPORT")
  WebElement Support;
  public void Support ()
  {
	  Support.click();
  }
  @FindBy(name="userName")
  WebElement UserName;
  @FindBy(name="password")
  WebElement Password;
  @FindBy(name="Login")
  WebElement SignIn;
  
  public void LogIn(String u,String p)
  {
	  UserName.sendKeys(u);
	  Password.sendKeys(p);
	  SignIn.click();
  }
  
  
  
  
  
}
