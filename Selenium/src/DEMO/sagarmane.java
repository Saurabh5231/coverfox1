package DEMO;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sagarmane {

	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://recruitmentuat.choicetechlab.com/recruitment/jobs");
Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#Username")).sendKeys("ganesh.kharche@choicetechlab.com");
driver.findElement(By.cssSelector("input#Password")).sendKeys("GaneshK@#321");
driver.findElement(By.xpath("(//button[text()=\"Login\"])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()=\"Yes, Allow\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()=\"Create Job\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//img[@alt=\"Use Template\"])[2]")).click();
Thread.sleep(2000);

       /*String main = driver.getWindowHandle();
       System.out.println(main);
      Set<String> all = driver.getWindowHandles();
      System.out.println(all);
     // Iterator<String> it = allwindow.iterator();
    // String child = it.next();
    // driver.switchTo().window(child);*/
      jobcreationdetail();

	}
	
	public static void jobcreationdetail()
	{
driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("QA Engineer");
		//xpath for popup form (//form[contains(@class,'MuiBox-root ')])[2]
	}
	

}
