package yahoo_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Yahoo_Email 

{
	ChromeDriver driver;
	
	@BeforeClass 
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahima\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("==========Browser started=========");
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void ClickLogin()
	{
		
		driver.findElementByXPath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[1]/a").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("yahoo.com"));
		System.out.println("ClickLogin Successful");
		
	}
	
	@Test(priority=2)
	public void LingIn()
	{
		driver.findElementByXPath("html/body/div[2]/div[1]/div[1]/form/div[2]/input[1]").sendKeys("Lshahreair");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("login-signin").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean status=driver.findElementByXPath("html/body/div[2]/div[2]/div[1]/div[2]/div/div/p/a").isDisplayed();
		Assert.assertTrue(status);
		System.out.println("Login UserName Successful");
	}
	
	@Test(priority=3)
	public void PasswordSingIN()
	{
	driver.findElementById("login-passwd").sendKeys("Ayeisha2007/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementById("login-signin").click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	boolean status=driver.findElementByXPath("html/body/div[2]/div/div/div/div/div/div/div[3]/ul/li[1]/a/span").isDisplayed();
	Assert.assertTrue(status);
	System.out.println("Login with Password Seccessful");
	}
	
	@Test(priority=4)
	public void LogOUT()
	{
		 WebElement  MoveOverLogout=driver.findElementByXPath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[1]/button");
		 Actions act = new Actions(driver);
		 act.moveToElement(MoveOverLogout).perform();
		 Sleeper.sleepTightInSeconds(20);
		// driver.findElementByXPath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[1]/div/div[2]/a").click();
		 driver.findElementById("uh-signout").click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Sleeper.sleepTightInSeconds(20);
		boolean status=(driver.findElementByXPath("html/body/div[2]/div/div/div/div/div/div/div[2]/div/ul/li[1]/a")).isDisplayed();
		Assert.assertTrue(status);
		
		//https://www.yahoo.com/
	//	String currentURL=driver.getCurrentUrl();
		//Assert.assertTrue(currentURL.contains("http:\\yahoo.com"));
		
		System.out.println("Logout seccessful");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
