package com_testNG_Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void LanchApplication()
	{
		System.out.println("This will launch Gmail Application");
	}
	 @Test(priority=1)
	  public void Login()
	  {System.out.println("This will Login to Application");
		  
	  }
		@Test(priority=2)
		public void InBox()
		{
			System.out.println("This Is Used to Test InBox");
		}
		
	@AfterTest
	public void ApplicationClose()
	{
		
		System.out.println("This is Used to Close The Application");
	}
}
