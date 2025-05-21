package Selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj= new ChromeDriver();
		
		//obj.get("https://www.ssgmcollege.org/");
		obj.navigate().to("https://www.ssgmcollege.org/");
		
	
		Thread.sleep(3000);
		
		obj.manage().window().maximize();
		Thread.sleep(2000);
		obj.manage().window().minimize();
		
		
		
	
	

}
}