package Coverfox_testPackage;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Coverfox_BasePackage.BaseClass;
import Coverfox_POM.CoverfoxTerminsurancepage;
import Coverfox_POM.HomePage;

public class TC_123_validateOTPpage extends BaseClass {
	 
	HomePage HM;// global object of homepage class in base package
	CoverfoxTerminsurancepage termpage;
	 
public static Logger logger;// delcare at global level so we can use 
	// open browse
	@BeforeTest
	public void openbrowser() {
		launchbrowser();
		logger= logger.getLogger("maven TC 1");
		//logger.info("Opening browser");
	}

	@BeforeClass
	public void RedirecttoTermInsurance() throws InterruptedException {
		HM = new HomePage(driver); // instead of creting local create global as we an use through all methods
		// initialize object
		
		// initialize object
		// hover in insu>ter>andclicktermnisurance
		Thread.sleep(2000);
		HM.hovertoInsurance(driver);
		logger.info("navigating to insurance");
		Thread.sleep(2000);
		HM.hovertoTerm(driver);
		logger.info("navigating to Term");
		Thread.sleep(2000);
		HM.clickontermInsurance(driver);
		logger.info("navigating to insurance and clicking");
		
	}
	@BeforeMethod
	public void EnterBasicdetail() throws InterruptedException
	{
		// enter gender age name mob no @before method
		termpage = new CoverfoxTerminsurancepage(driver);
		termpage.clickongender();
		logger.info("clicking on gender");
		termpage.clickonage();
		logger.info("clicking on age");
		termpage.sendageinsearchbox(driver);
		logger.info("entering age ");
		termpage.entername();
		logger.info("entering name ");
		termpage.EnterMobilenum();
		logger.info("entering Mo no ");
		termpage.clickonviewquotebutton();
		logger.info("clicking on save button  ");
	  //  termpage.OTPwindowresult();
	
		
	}
	
	@Test
	public void validateOTPpage() {
	logger= logger.getLogger("maven TC 1");
	PropertyConfigurator.configure("log4j.properties");
	

		//Assert.fail();
		   boolean expectedresult = termpage.OTPwindow.isDisplayed();
		Assert.assertTrue(expectedresult,"popup not Display,TC is failed");
		logger.info("validating TC result ");	
	
		Reporter.log("Ashita has changes in code", true);
	
	
	}
	
}
