package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		WebElement Box = driver.findElement(By.id("displayed-text"));
		
		if (Box.isDisplayed())
		{
			Box.sendKeys("Rohit");
		}
		else {
			System.out.println("element is not dispalyed");
		}
		
	}

}
