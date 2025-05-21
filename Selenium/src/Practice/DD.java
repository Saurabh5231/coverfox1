package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement drag = driver.findElement(By.id("div1"));
		WebElement drop = driver.findElement(By.id("div2"));
		
		Thread.sleep(2000);
		Actions AC=new Actions(driver);
	AC.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
	}

}
