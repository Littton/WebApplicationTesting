package com_MoveHover_Opereation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MoveHover_PC_Richard_Appliances {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.pcrichard.com/");
		driver.manage().window().maximize();
		
		
    WebElement Appliances =  driver.findElement(By.xpath(".//*[@id='mainnavigation']/div/ul[2]/li[1]/a"));
	Actions act = new Actions(driver);
	
	act.moveToElement(Appliances).perform();
	
	//Sleeper.sleepTightInSeconds("10");
	 Sleeper.sleepTightInSeconds(10);
	
	driver.findElement(By.xpath(".//*[@id='navcontent']/div/div[1]/div/div/ul/li[3]/a")).click();
	
	
	}
	
	

}
