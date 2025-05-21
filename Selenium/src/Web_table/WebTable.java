package Web_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		// to find total number of rows
		int totalrow = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();

		System.out.println("total number of rowa are " + totalrow);

// to get total number of column

		int totalcolumn = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th")).size();
		System.out.println("Total number of column are " + totalcolumn);
		
	}

}
