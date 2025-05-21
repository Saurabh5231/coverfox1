package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();

		wb.navigate().to("https://www.saucedemo.com/");
		
		Thread.sleep(1000);
		
		WebElement text = wb.findElement(By.id("user-name"));
		text.sendKeys("standard_user");
		
		Thread.sleep(1000);
		WebElement pass = wb.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		WebElement button = wb.findElement(By.xpath("//input[@id='login-button']"));

		button.click();

	}

}
