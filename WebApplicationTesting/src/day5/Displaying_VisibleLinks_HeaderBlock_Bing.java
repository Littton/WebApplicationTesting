package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Displaying_VisibleLinks_HeaderBlock_Bing {

	public static void main(String[] args) {
	
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Bing.com");
		driver.manage().window().maximize();
		
  WebElement Headerblock = driver.findElement(By.id("sc_hdu"));
  
  List<WebElement>headerlinks=Headerblock.findElements(By.tagName("a"));
  
   System.out.println(headerlinks.size());
   
   for(int i=0;i<headerlinks.size();i++)
   {  
	  if(headerlinks.get(i).isDisplayed())
	  {
	   String headerlinkName = headerlinks.get(i).getText();
   System.out.println(headerlinkName);
   }
	  }
  
   driver.close();

	}

}