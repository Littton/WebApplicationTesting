package com_Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
//import org.eclipse.jetty.server.Response.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screen_Shot_Bing {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://Facebook.com");
	
	//Sleeper.sleepTightInSeconds(10);
	
	Thread.sleep(10000);

File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile, new File("C:\\Users\\Fahima\\Desktop\\Selenium Class\\ScreenShots\\Facebook\\.png"));
		
	}

}
