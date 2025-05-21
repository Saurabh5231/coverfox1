package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_mouseaction {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ssgmcollege.org/");
	WebElement NAAC = driver.findElement(By.xpath("//p[text()='NAAC']"));
Actions AC=new Actions(driver);
Thread.sleep(2000);

// click method 
AC.click(NAAC).perform();
// moveelement and click 
AC.moveToElement(NAAC).click().build().perform();

// right click (contxt click)
AC.contextClick(NAAC).perform();



	}

}
