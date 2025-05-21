package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hover_effect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2Faccount%2Flogin%253Fret%253D%252F ");
		WebElement DD = driver.findElement(By.xpath("(//div[@class='qstlfY'] )[2]"));
DD.click();
	}

}
