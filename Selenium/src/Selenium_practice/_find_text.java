package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class _find_text {

	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement Placeholder = driver.findElement(By.id("email"));


		// to get text in placeholder put value as placeholder
		String P = Placeholder.getAttribute("Placeholder");
		System.out.println(P);

		WebElement T = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
// to get text 
		// T.getText();
		System.out.println(T.getText());
		
		
		WebElement Pass = driver.findElement(By.id("pass"));
		//Pass.getAttribute("Placeholder");
		System.out.println(Pass.getAttribute("Placeholder"));
		

	}

}
