package Coverfox_testPackage;



import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Coverfox_BasePackage.BaseClass;
import Coverfox_POM.CoverfoxTerminsurancepage;
import Coverfox_POM.HomePage;

public class TC_123_validateOTPpage extends BaseClass {
	HomePage HM;// global object of homepage class in base package
	CoverfoxTerminsurancepage termpage;

	// open browser

	@BeforeTest
	public void openbrowser() {
		launchbrowser();
	}

	@BeforeClass
	public void RedirecttoTermInsurance() throws InterruptedException {
		HM = new HomePage(driver); // instead of creting local create global as we an use through all methods
		// initialize object
		
		// initialize object
		// hover in insu>ter>andclicktermnisurance
		HM.hovertoInsurance(driver);
		Thread.sleep(2000);
		HM.hovertoTerm(driver);
		Thread.sleep(2000);
		HM.clickontermInsurance(driver);
		
	}
	@BeforeMethod
	public void EnterBasicdetail()
	{
		// enter gender age name mob no @before method
		termpage = new CoverfoxTerminsurancepage(driver);
		termpage.clickongender();
		termpage.clickonage();
		termpage.sendageinsearchbox(driver);
		termpage.entername();
		termpage.EnterMobilenum();
		termpage.clickonviewquotebutton();
	  //  termpage.OTPwindowresult();
	
	}
	
	@Test
	public void validateOTPpage() {
		//Assert.fail();
		   boolean expectedresult = termpage.OTPwindow.isDisplayed();
		Assert.assertTrue(expectedresult,"popup not Display,TC is failed");
	}
}
