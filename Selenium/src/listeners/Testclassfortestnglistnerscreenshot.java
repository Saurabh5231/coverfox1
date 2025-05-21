package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
 @Listeners(listeners.Listnerclassforscreenshot.class)
 
public class Testclassfortestnglistnerscreenshot {
	  protected static WebDriver driver;
  @Test
  public void takescrenshot() {
	   driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.findElement(By.name("firstname")).sendKeys("saurabh");
	  driver.findElement(By.name("lastname")).sendKeys("Yadav");
	  driver.findElement(By.name("reg_email__")).sendKeys("sarabhyadav@gmail.com");
	  
  }
}
