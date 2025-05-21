package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_class implements ITestListener
{
	
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("Trasanction succesfully done",true);
	
}


@Override
public void onTestFailure(ITestResult result) {
Reporter.log("Trasanction failed ", true);
}


@Override
public void onTestSkipped(ITestResult result) {
Reporter.log("Trasanction is skipped", true);	
}
}
