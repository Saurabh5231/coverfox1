package Coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
	
	// variables declaration 
	@FindBy(xpath="//span[text()='Insurance']") private WebElement Insurance;
	@FindBy(xpath ="//a[@id='term-to-product']" )private WebElement Term;
	@FindBy(xpath = "(//a[text()='Term Insurance'])[1]")private WebElement Terminsurance;

	// constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//
	public void hovertoInsurance(WebDriver driver)
	{
		Reporter.log("redirecting to Insurance",true);
		Actions act=new Actions(driver);
		act.moveToElement(Insurance).perform();
		
	}
	
	public void hovertoTerm(WebDriver driver)
	{Actions act=new Actions(driver);
	Reporter.log("redirecting to Term",true);
		act.moveToElement(Term).perform();
	}
	public void clickontermInsurance(WebDriver driver)
	{
		Actions act=new Actions(driver);
		Reporter.log("Clicking on Terminsurance",true);
		act.moveToElement(Terminsurance).click().build().perform();
	}
	

}
