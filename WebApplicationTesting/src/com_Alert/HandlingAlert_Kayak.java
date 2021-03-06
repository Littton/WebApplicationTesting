package com_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HandlingAlert_Kayak {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver= new FirefoxDriver();
		 driver.get("https://www.kayak.com/");
		 driver.manage().window().maximize();
		 Sleeper.sleepTightInSeconds(10);
		 //driver.findElement(By.id("c9WRj-submit")).click();
		//.//*[@id='c2UoR-submit']
		// driver.findElement(By.xpath(".//*[@id='c9WRj-submit']")).click();
		 driver.findElement(By.xpath(".//id[text()='-submit']")).click();
		// ((WebElement) driver.findElements(By.name("submit"))).click();
		 
		// driver.findElement(By.className("Search")).click();
		//driver.findElement(By.tagName("submit")).click();
		 
		 Alert  alt= driver.switchTo().alert();
		//alt.sendKeys("New York");
		  driver.findElement(By.id("New York")).sendKeys("Washington");
		
		System.out.println(alt.getText());
		
		Sleeper.sleepTightInSeconds(10);
		 alt.accept();
		// alt.dismiss();
		
		
	
	
	}

	}


