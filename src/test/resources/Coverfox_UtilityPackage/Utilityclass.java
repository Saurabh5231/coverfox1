package Coverfox_UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass {

	public static void getScreenshot(WebDriver driver, String filename) throws IOException {

		String timestamp = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\saura\\eclipse-workspace\\Selenium\\screenshot\\" + filename + timestamp + ".png");
		FileHandler.copy(source, Destination);
	}
	public static String getdatafrompropertyfile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\saura\\eclipse-workspace\\Selenium\\coverfoxpropfile.properties");
			prop.load(myfile);
			String PRPFN = prop.getProperty(key);
			return PRPFN;
}
}
