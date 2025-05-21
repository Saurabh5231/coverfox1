package Selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiple_by_dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000))
;
		WebElement multiple = driver.findElement(By.cssSelector("div#checkbox-example"));
	
		Select s =new Select(multiple);
		s.isMultiple();
		s.selectByValue("option1");
		s.selectByValue("option2");
		s.selectByValue("option3");
		
		
		//// pending to check with select class
	}

}
