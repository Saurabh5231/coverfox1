package DEMO;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/mobile-phone-cases");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@draggable='false'])[6]")).click();
		Thread.sleep(2000);
	//	String singlewindowID = driver.getWindowHandle();
		// System.out.println(driver.getWindowHandle());
		Set<String> allwindowID = driver.getWindowHandles();
		// System.out.println(driver.getWindowHandles());
		Iterator<String> iterator = allwindowID.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.switchTo().window(parent);

	}

}
