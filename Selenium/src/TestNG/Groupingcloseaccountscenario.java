package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupingcloseaccountscenario {
  @Test
  public void f() 
  {
	 Reporter.log("in no any group"); 
  }
  @Test(groups ="close account")
  public void d()
  {
  	Reporter.log("method b close account");
  }
  @Test(groups ="close account")
  public void e()
  {
  	Reporter.log("method e close account");	
  }
}
