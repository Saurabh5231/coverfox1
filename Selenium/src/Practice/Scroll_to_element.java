package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_to_element {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	WebElement women = driver.findElement(By.cssSelector("button#mousehover"));
	
	Actions act= new Actions(driver);
	
	act.scrollToElement(women).click().build().perform();
	}

}
