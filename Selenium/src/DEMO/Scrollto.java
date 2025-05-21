package DEMO;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Scrollto {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//WebElement button = driver.findElement(By.xpath("//legend[text()=\"Mouse Hover Example\"]"));

		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()", button);
		WebElement newtab = driver.findElement(By.id("opentab"));
		//newtab.click();
		//Set<String> all = driver.getWindowHandles();
		//Iterator<String> iterator = all.iterator();
		//String parent = iterator.next();
      //  String child = iterator.next();
        //driver.switchTo().window(child);
        Thread.sleep(2000);
       // driver.findElement(By.xpath("(//a[text()=\"Courses\"])[1]")).click();
      //  driver.switchTo().window(parent);
     //  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // File dest = new File("D:\\\\ss.png");
      // FileHandler.copy(src, dest);
       WebElement multiple = driver.findElement(By.id("dropdown-class-example"));
       Select select = new Select(multiple);
       select.selectByVisibleText("Option1");
	}

}
