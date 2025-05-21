package Web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_code_for_webtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int totalcolumn = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th")).size();

		int totalrow = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();

		// to read complete column

		for (int i = 1; i <= totalcolumn; i++)

		{
			String columnvalue = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr/th[" + i + "]"))
					.getText();

			System.out.println("column value is " + columnvalue);
		}
		System.err.println();
		System.out.println("-----------------------------------");

		// to read complete row
		for (int j = 1; j <= totalrow; j++) {

			String Rowvalue = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + j + "]")).getText();
			System.out.println(Rowvalue+ "| ");

		}
		System.out.println();
	}

}
