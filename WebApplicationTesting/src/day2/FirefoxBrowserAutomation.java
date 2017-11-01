package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation {

	public static void main(String[] args)
{
  FirefoxDriver driver = new FirefoxDriver();
   driver.get("http://www.google.com");
   driver.navigate().to("http://www.facebook.com");
   driver.close();
	}

}
