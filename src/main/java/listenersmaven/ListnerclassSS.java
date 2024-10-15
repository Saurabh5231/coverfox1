package listenersmaven;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Commanlyusedmethod.Commanlyusedmethods;
import Coverfox_testPackage.TC_123_validateOTPpage;


public class ListnerclassSS  extends TC_123_validateOTPpage implements ITestListener 

{
	
@Override
public void onTestSuccess(ITestResult result) {
	result.getName();
	try {
		Commanlyusedmethods.getScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
