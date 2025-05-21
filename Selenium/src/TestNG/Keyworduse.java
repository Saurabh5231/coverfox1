package TestNG;

import java.awt.event.InvocationEvent;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyworduse {
  @Test(priority = 1)
  public void a() {
	  Reporter.log("Method a is running");
  }
  
  @Test(priority =-1 )
  public void b()
  {
	  Reporter.log("Method b is running");
  }

  @Test
  public void c()
  {Assert.fail();
	  Reporter.log("Method c is running");
  }

  @Test(priority = 2)
  public void d()
  {
	  Reporter.log("Method d is running");
  }
  @Test (invocationCount = 3)
  public void e()
  {
	  Reporter.log("Method e is running");
  }
}
