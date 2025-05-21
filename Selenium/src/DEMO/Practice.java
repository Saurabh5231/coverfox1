package DEMO;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		WebElement menTab = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(menTab).perform();

		driver.findElement(By.xpath("//a[text()='Phone Cases']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[text()='iPhone 15 Pro Max Back Case']")).click();
		Thread.sleep(1000);

		Set<String> allTabs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allTabs);
		driver.switchTo().window(al.get(1));

		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']"));

		// verify price is displayed
		System.out.println("Price is displayed " + price.isDisplayed());

		// price should not less than Rs.10/-
		String price1 = price.getText();
		System.out.println(price1);
		String p2 = price1.substring(1, 4);
		int amount = Integer.parseInt(p2);
		System.out.println(amount);

		if (amount > 10) {
			System.out.println("Price is more than Rs.10");
		} else {
			System.out.println("Price should not less than Rs.10");
		}

		// verify ADD TO BAG button is displayed
		WebElement button = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		System.out.println("ADD TO BAG button is displayed " + button.isDisplayed());

		driver.quit();

	}

}
