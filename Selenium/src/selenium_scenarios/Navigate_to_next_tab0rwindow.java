package selenium_scenarios;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to_next_tab0rwindow {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.id("openwindow")).click();
		Set<String> handle = driver.getWindowHandles();
	Iterator<String> it = handle.iterator();
	
	String parent = it.next();
	           String child = it.next();
	           
	           driver.switchTo().window(child);
	           
	           driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	           driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
	           
	}

}
