package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import Commanlyusedmethod.Commanlyusedmethods;
import POM.TestClass;

public class Listnerclassforscreenshot extends Testclassfortestnglistnerscreenshot implements ITestListener
{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		result.getName();// to get the method name which is passed or fail
		Reporter.log("screenshot is taken ",true);
		try {
			Commanlyusedmethods.getScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}