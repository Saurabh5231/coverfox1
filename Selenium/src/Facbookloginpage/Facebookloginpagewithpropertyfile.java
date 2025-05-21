package Facbookloginpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import Commanlyusedmethod.Commanlyusedmethods;

public class Facebookloginpagewithpropertyfile {

	
	
	public static void main(String[] args) throws IOException {
		 WebDriver driver;
	
	
	driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		  driver.findElement(By.name("firstname")).sendKeys(Commanlyusedmethods.getdatafrompropertyfile("Firstname"));
		  driver.findElement(By.name("lastname")).sendKeys(Commanlyusedmethods.getdatafrompropertyfile("Lastname"));
		  driver.findElement(By.name("reg_email__")).sendKeys(Commanlyusedmethods.getdatafrompropertyfile("EmailID"));
		  
		

	}

}
