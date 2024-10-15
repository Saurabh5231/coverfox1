package Coverfox_BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass {
	//driver
	// open browser
	//launch url 
	//close browser
	
	protected static WebDriver driver; 
	public void launchbrowser()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("disable-notifications");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");// pending to get it from proprty file 
		Reporter.log("browser launching",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log(" Waiting...",true);	
	}
	public void Closebrowser()
	{Reporter.log("closing browser");
		driver.quit();
	}

	
}
