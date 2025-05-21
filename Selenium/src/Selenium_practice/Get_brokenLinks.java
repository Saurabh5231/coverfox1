package Selenium_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_brokenLinks {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://dbcartindia.com/careers");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

    List<WebElement> links = driver.findElements(By.tagName("a"));
    for (WebElement link : links) {
        String url = link.getAttribute("href");
        if (url != null && !url.isEmpty()) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
           //     connection.setRequestMethod("HEAD"); // dont know exact   use of this 
              //  connection.connect();  //dont know exact   use of this 
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Broken Link: " + url + " (" + responseCode + ")");
                }
            } catch (IOException e) {
                System.out.println("Error checking link: " + url);
            }
        }
    }
    driver.quit();
   
	
	}

}
