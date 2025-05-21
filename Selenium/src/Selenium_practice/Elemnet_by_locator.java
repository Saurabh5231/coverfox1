package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemnet_by_locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dd=new ChromeDriver();
		dd.navigate().to("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		WebElement enter = dd.findElement(By.xpath("//input[@name='user-name']"));
		enter.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement Pass = dd.findElement(By.id("password"));
		Pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement clk = dd.findElement(By.xpath("//input[@type='submit']"));
		clk.click();

	}

}
