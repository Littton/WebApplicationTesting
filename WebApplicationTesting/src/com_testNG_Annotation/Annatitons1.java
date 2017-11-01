package com_testNG_Annotation;

import org.testng.annotations.Test;

public class Annatitons1 {
	
	@Test(priority=1) //Test Cases
	public void LaunchApplication()
	{
		System.out.println("This will launch Gmail Application");
		
	}
  @Test(priority=2)
  public void Login()
  {System.out.println("This will Login to Application");
	  
  }
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("This Is Used to Test InBox");
	}
}
