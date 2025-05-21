package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupingsavingaccountscenario {
	
  @Test(groups ="saving account" )
  public void a()
  {
	  Reporter.log("method a saving account");
  }

@Test(groups ={"close account","saving account"} )
public void b()
{
	Reporter.log("method c saving and close account");
	}
@Test(groups ="saving account" )
public void c()
{
	Reporter.log("method d saving account");
}


}

