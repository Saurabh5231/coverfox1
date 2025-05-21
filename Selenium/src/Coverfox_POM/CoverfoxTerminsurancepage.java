package Coverfox_POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverfoxTerminsurancepage {

	// private static final WebDriver WebDriver = null;
	@FindBy(xpath = "//div[text()='Male']")
	private WebElement gender;
	@FindBy(css = "div.w--multi_select_handle")
	private WebElement Age;
	@FindBy(css = "input#SearchBox")
	private WebElement Searchbox;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement name;
	@FindBy(xpath = "//input[@type='tel']")private WebElement Mobno;
    @FindBy(xpath = "//button[text()='View Quotes']") private WebElement savebutton;
    @FindBy(xpath="//button[@title=\"SUBMIT\"]")
	  public static WebElement OTPwindow;
    public CoverfoxTerminsurancepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements( driver,this);
	
}

public void clickongender()

{Reporter.log("clicking on gender",true);
	gender.click();}

public void clickonage()
{Reporter.log("clicking on age",true);
	Age.click();
}
public void sendageinsearchbox(WebDriver driver)
{ 
	 Actions act=new Actions(driver );
	 Searchbox.click();
	 Reporter.log("selecting on age",true);
	 act.sendKeys(Searchbox,"24").sendKeys(Keys.ENTER).build().perform(); 
}
public void entername()
{
	Reporter.log("Entering name",true);
	name.sendKeys("sanklecha");
}
public void EnterMobilenum()
{
	Reporter.log("Entering mobile number",true);
	Mobno.sendKeys("8888888888");	
}
public void clickonviewquotebutton()
{
	Reporter.log("clicking in save button ",true);
	savebutton.click();	
}
  /*public void OTPwindowresult()
{Reporter.log("OTP popup page is visible",true);
	if (OTPwindow.isDisplayed())
	{
		
	}*/
}

