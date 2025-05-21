package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialrun {
	 @Test(priority =1)
	  public void flipkart() {
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
	  }
	  @Test (priority =0)
	  public void ajio() {
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.ajio.com/");
	  }
	  @Test(priority =-1)
	  public void Amazon() {
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/ref=nav_logo");
	  }
}
