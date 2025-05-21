package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#id_name")).sendKeys("Test@saurabh");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("input.cls_animation[id=id_email]"));
		email.sendKeys("Saurabh@gmail.com");
		
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("1234567");
	
		
	}

}
