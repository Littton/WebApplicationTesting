package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock {

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
  
  System.out.println(HeaderLink);
  
  }
  
   driver.close();
		
		

	}

}
