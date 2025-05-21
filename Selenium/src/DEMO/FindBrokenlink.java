package DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenlink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		Thread.sleep(4000);
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		alllink.size();
		
		for (int i=0;i<=alllink.size()-1;i++)
		{
			WebElement element = alllink.get(i);
			
		}
	}
	

}
