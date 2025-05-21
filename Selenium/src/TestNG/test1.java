package TestNG;

import javax.imageio.spi.RegisterableService;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
  @Test
  public void a() {
	  Reporter.log("method a is passed ", true);
  }
  @Test
  public void b()
  {
	 Reporter.log("method b is passed ", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("method c is passed ", true);
  }
  @Test
  public void d()
  {
	 // Reporter.log("method d is passed ", false); // will get statmnt in console & html
	  System.out.println("method d is passed");// get only in console
  }
  
}
