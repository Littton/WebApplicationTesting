package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_Title_Newtours {

	public static void main(String[] args) {
	
	FirefoxDriver driver = new FirefoxDriver();
		
	driver.get("http://newtours.demoaut.com");
	System.out.println(driver.getTitle());
	driver.close();
	}

}
