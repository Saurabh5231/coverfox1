package selenium_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_colour_of {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		WebElement colour = driver.findElement(By.xpath("//input[@value='Check Your Refund']"));
		colour.getCssValue("background");
		System.out.println(colour.getCssValue("background"));
		

	}

}
