package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_locator_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("year")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_month")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.partialLinkText(""));
		
		driver.findElement(By.linkText("Already have an account?")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Already")).click();
	}

}
