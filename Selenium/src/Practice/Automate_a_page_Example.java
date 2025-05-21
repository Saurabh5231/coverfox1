package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automate_a_page_Example {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable notification");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");

		WebElement Gender = driver.findElement(By.xpath("//div[text()='Male']"));
		Gender.click();
		Thread.sleep(1000);
		WebElement wife = driver.findElement(By.xpath("//div[text()='Wife']"));
		wife.click();
		WebElement nextbutton = driver.findElement(By.className("next-btn"));
		nextbutton.click();
		Thread.sleep(1000);
		WebElement yourage = driver.findElement(By.cssSelector("select#Age-You"));
		WebElement spouceage = driver.findElement(By.cssSelector("select#Age-Spouse"));
		Select select = new Select(yourage);
		Select select1 = new Select(spouceage);
		Thread.sleep(1000);
		select.selectByVisibleText("32 years");
		Thread.sleep(1000);
		select1.selectByValue("28y");
		driver.findElement(By.xpath("//div[@class='next-btn']")).click();
		Thread.sleep(1000);
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='6 Digit Pincode']"));
		pincode.sendKeys("423601");
		Thread.sleep(1000);
		WebElement mobileno = driver.findElement(By.xpath("//input[@placeholder='Your mobile number']"));
		mobileno.sendKeys("8888888888");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		Thread.sleep(3000);
		String totalmatchingresult = driver
				.findElement(By.xpath("//div[contains(text(),' matching Health Insurance')]")).getText();
		String numberofmatching = totalmatchingresult.substring(0, 2);// to get dynamic text in string
		int Actualmatching = Integer.parseInt(numberofmatching);// syntax to convert string to integer
		System.out.println("Total number of matching result is " + Actualmatching);

		int numberofblock = driver.findElements(By.cssSelector("div.pcc-main")).size();
		if (Actualmatching == numberofblock) {
			System.out.println("total number ofnumber block and Actual matching is same hence TC is passeed  ");
		} else {
			System.out.println("test case is failed");
		}
	}

}
