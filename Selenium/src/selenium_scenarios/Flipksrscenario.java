package selenium_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipksrscenario {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	Actions act= new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement searchbox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	searchbox.sendKeys("iphone");
	act.sendKeys(Keys.ENTER);
	
	}

}
