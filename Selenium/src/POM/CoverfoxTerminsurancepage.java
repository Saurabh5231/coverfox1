package POM;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath="//button[@title=\"SUBMIT\"]") private WebElement OTPwindow;
  
    
    public CoverfoxTerminsurancepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements( driver,this);
	
}

public void clickongender()
{gender.click();}

public void clickonage()
{
	Age.click();
}
public void sendageinsearchbox(WebDriver driver)
{ 
	 Actions act=new Actions(driver );
	 Searchbox.click();
	 act.sendKeys(Searchbox,"24").sendKeys(Keys.ENTER).build().perform(); 
}
public void entername()
{
	name.sendKeys("Saurabh");
}
public void EnterMobilenum()
{
	Mobno.sendKeys("8888888888");	
}
public void clickonviewquotebutton()
{
	savebutton.click();
}
public void OTPwindowresult()
{
	if (OTPwindow.isDisplayed())
	{
		System.out.println("Testcase is passed");
	}
	
}
}
