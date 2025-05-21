package First_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_1st_code {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();

		 driver.manage().window().maximize();
		// driver.manage().window().minimize();

	}
}
