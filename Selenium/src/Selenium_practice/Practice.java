package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		/*	//driver.navigate().to("https://www.goibibo.com");
			driver.get("https://www.guru99.com/");
			Thread.sleep(2000);
			driver.navigate().to("https://www.goibibo.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();*/
		driver.navigate().to("https://www.goibibo.com");
		String title = driver.getTitle();
	
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
			
	}

}
