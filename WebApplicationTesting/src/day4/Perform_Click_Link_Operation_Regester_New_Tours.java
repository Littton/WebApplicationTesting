package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_Click_Link_Operation_Regester_New_Tours {

	public static void main(String[] args) {
  
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.linkText("Vacations")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();

	}

}
