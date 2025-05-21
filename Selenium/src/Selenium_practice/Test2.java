package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new ChromeDriver();
		wb.navigate().to("https://formy-project.herokuapp.com/checkbox");
		WebElement CB = wb.findElement(By.id("checkbox-1"));
		Thread.sleep(2000);
		CB.click();

	}

}
