package POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;

@Listeners(listeners.Listnerclassforscreenshot.class)
public class TestClass {
	//protected static WebDriver driver;// created static global driver because it can call to another method as well
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(CO);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		HomePage a = new HomePage(driver);
		
		a.hovertoInsurance(driver);
		Thread.sleep(2000);
		
		a.hovertoTerm(driver);
		Thread.sleep(2000);
		
		a.clickontermInsurance(driver);
	//Commanlyusedmethods.getScreenshot(driver, "Insurancepage");// (to take screen shot)
	//Commanlyusedmethods.readdatefromExcel(null, null, 0, 0);
	
	CoverfoxTerminsurancepage insu=new CoverfoxTerminsurancepage(driver);
	Thread.sleep(2000);
	insu.clickongender();
	Thread.sleep(2000);
	insu.clickonage();
	Thread.sleep(2000);
	insu.sendageinsearchbox(driver);
	Thread.sleep(2000);
	insu.entername();
	Thread.sleep(2000);
	insu.EnterMobilenum();
	insu.clickonviewquotebutton();
	insu.OTPwindowresult();
	
	

	}

}
