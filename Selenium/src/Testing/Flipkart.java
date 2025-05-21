package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		kurtas();
	}

	public static void kurtas() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		act.moveToElement(fashion).perform();

		Thread.sleep(2000);
		WebElement kurtas = driver.findElement(By.xpath("(//a[@class='_3490ry'])[4]"));
		act.moveToElement(kurtas).click().build().perform();

	}

}
