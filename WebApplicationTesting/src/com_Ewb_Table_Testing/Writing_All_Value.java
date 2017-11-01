package com_Ewb_Table_Testing;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Writing_All_Value {

	public static void main(String[] args) throws IOException 
	
	{

  FirefoxDriver driver= new FirefoxDriver();
  driver.get("http://newtours.demoaut.com");
  driver.findElement(By.linkText("REGISTER")).click();
  
    WebElement Country=driver.findElement(By.name("country"));//.getText();
  
 List< WebElement> CountryName=Country.findElements(By.tagName("option"));
  
 
System.out.println( CountryName.size());

for(int i=0;i<CountryName.size();i++)
	//for(int i=0;i<=CountryName.size();i++)
{   
	String Countryname=CountryName.get(i).getText();
	System.out.println(Countryname);
	
	
}

driver.close();
	}

}