package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_Url_Mercury_Tours {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
