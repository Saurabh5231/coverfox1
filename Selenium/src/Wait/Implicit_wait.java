package Wait;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.discoveryplus.in/");
	
	// implicit wait applicable for all page element 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	
	
	
	}

}
