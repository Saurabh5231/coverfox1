package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_testing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.xpath("//input[contains( @id,'u_0_5_/V')]")).click();
		
  WebElement radio = driver.findElement(By.xpath("//input[contains( @id,'u_0_4')]"));
radio.click();


System.out.println(radio.isSelected());
	}

}
