package Commanlyusedmethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;


public class Commanlyusedmethods {
 WebDriver driver;
	public static void getScreenshot(WebDriver driver, String filename) throws IOException {

		String timestamp = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\saura\\eclipse-workspace\\project1\\src\\test\\resources\\screenshot" + filename + timestamp + ".png");
		FileHandler.copy(source, Destination);
	}

	public static String readdatefromExcel(String Excelname, String sheetname, int rownum, int cellnum)
			throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream(Excelname);
		String value = WorkbookFactory.create(myfile).getSheet(sheetname).getRow(rownum).getCell(cellnum)
				.getStringCellValue();
		return value;// as we are getting return value as string hence return type is string rather than void

	}
	public static String getdatafrompropertyfile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\saura\\eclipse-workspace\\Selenium\\src\\Config.properties");
			prop.load(myfile);
			String PRPFN = prop.getProperty(key);
			return PRPFN;
			
		
	}
	
	
}
