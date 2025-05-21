package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConditionScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/ ");
		WebElement Username = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("submit"));
	Thread.sleep(2000);
		Username.sendKeys("student");
		Password.sendKeys("Password1234");
		submit.click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement error1 = driver.findElement(By.xpath("//div[text()='Your username is invalid!']"));
		
		WebElement error2 = driver.findElement(By.xpath("//div[text()='Your password is invalid!']"));
	WebElement success = driver.findElement(By.xpath("//h1[text()='Logged In Successfully']"));
	WebDriverWait wt=new WebDriverWait(driver, Duration.ofMillis(5000));
	wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Your username is invalid!']")));
		if (error1.isDisplayed())
		{
			System.out.println("please enter valid username");
		}
	else if (error2.isDisplayed())
	{
		System.out.println("Please enter valid password");
	}
	else if (success.isDisplayed())
	{
		System.out.println("Congratulations student. You successfully logged in!");
	}
	
	{
		
	}
	}

}
