package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver DD=new ChromeDriver();
		
		DD.navigate().to("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		WebElement mo = DD.findElement(By.xpath("//input[@name='mobileNumber']"));
		mo.sendKeys("839040267");
		WebElement otp = DD.findElement(By.xpath("//button[text()='Get OTP']"));
		otp.isEnabled();
		System.out.println(otp.isEnabled());
		
		if(otp.isEnabled())
		{
			otp.click();
			System.out.println("enter otp");
		}
		
		else {
			System.out.println("plz enter valid  mobile no");
		}
		
		

	}

}
