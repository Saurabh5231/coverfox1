package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/signup");
		//driver.findElement(By.xpath("//input[@value='-1']")).click();

		 WebElement radio = driver.findElement(By.xpath("//input[@value='-1']"));
 WebElement drop = driver.findElement(By.xpath("//select [@name='preferred_pronoun']"));
 radio.click();
 
 WebElement value = driver.findElement(By.xpath("//option[contains(text(),'She')]"));
		if(radio.isSelected())
		{
			drop.click();
			Thread.sleep(2000);
			value.click();
			
		}
		else {
			System.out.println("plz select custom gender");
		}
	}

}
