package com_testNG_Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annatitions3 {
	
	@BeforeMethod
	public void LanchApplication_And_Login()
	{
		System.out.println("This will launch Gmail Application and Login To Gamil");
	}
	
	 @Test(priority=1)
	  public void Inbox()
	  {System.out.println("This will Inbox Test Functionality");
		  
	  }
		@Test(priority=2)
		public void SentMail()
		{
			System.out.println("This Is Used to Test Sent Mail Functionality");
		}
		
		@AfterMethod
		public void ApplicationClose()
		{
			
			System.out.println("This is Used to Close The Application");
		}
}

