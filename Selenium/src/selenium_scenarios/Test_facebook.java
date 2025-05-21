package selenium_scenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/signup ");
		
		WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
text.getText();

System.out.println(text.getText());
	}

}
