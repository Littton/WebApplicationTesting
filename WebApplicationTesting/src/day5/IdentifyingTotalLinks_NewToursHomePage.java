package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyingTotalLinks_NewToursHomePage {

	public static void main(String[] args) {
	
		  FirefoxDriver driver = new FirefoxDriver();
		   
		   
	  driver.get("http://newtours.demoaut.com");
		 // driver.get("http://yahoo.com");
driver.manage().window().maximize();
List<WebElement>links= driver.findElements(By.tagName("a"));
System.out.println(links.size());
for(int i=0;i<links.size();i++)
{
String linkName=links.get(i).getText();

System.out.println(linkName);
}
// String linkName=links.get(0).getText();

//System.out.println(linkName);
//String linkName1=links.get(1).getText();

//System.out.println(linkName);

driver.close();

	}

}
