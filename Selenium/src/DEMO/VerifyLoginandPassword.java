package DEMO;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class VerifyLoginandPassword {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
            WebElement username = driver.findElement(By.cssSelector("input#username"));
	// Object Username1 = username.sendKeys("student");
		 
	      
	//	username = username.getAttribute("value");
//	if (username .equals(Username1) )
	   {
		   System.out.println("please enter password");
	   }
	//   else {
		   System.out.println("Username is incorrect");
	   }
	//   System.out.println();
	}

//}
