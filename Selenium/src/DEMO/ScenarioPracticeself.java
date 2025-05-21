package DEMO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioPracticeself {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		WebElement mobileandaccesories = driver.findElement(By.xpath("//span[text()='Women Western']"));
	driver.getWindowHandles();
	System.out.println(driver.getWindowHandles());
	WebElement Brief = driver.findElement(By.xpath("//p[text()='Briefs']"));
	WebElement color = driver.findElement(By.xpath("(//div[contains(@class,'sc-ipEyDJ')])[3]"));
	//WebElement black = driver.findElement(By.xpath("//span[@label="Black"]"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(mobileandaccesories).click().perform();
	Thread.sleep(2000);
	act.moveToElement(Brief).click().perform();
	Thread.sleep(2000);
	act.moveToElement(color).click().perform();
	Thread.sleep(2000);
	//act.moveToElement(black).click().perform();
		
		
	}
}
