package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Header_Links_Perform_ClickOperation {

	public static void main(String[] args) 
	
	{

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
  WebElement HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
  List <WebElement>Headerlinks=HeaderBlock.findElements(By.tagName("a"));
  System.out.println(Headerlinks.size());
  
  for(int i=0;i<Headerlinks.size();i++)
  { String HeaderLink=Headerlinks.get(i).getText();
  Headerlinks.get(i).click();
  
  System.out.println(HeaderLink);
  
  System.out.println(driver.getTitle());
  System.out.println(driver.getCurrentUrl());
  System.out.println();
  driver.navigate().back();
  
  HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
  Headerlinks=HeaderBlock.findElements(By.tagName("a"));
  }
  
   driver.close();
		
		

	}

}
