package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kayak {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://kayak.com");
		
		driver.findElement(By.id("b8Ud-submit")).click();

	}

}
