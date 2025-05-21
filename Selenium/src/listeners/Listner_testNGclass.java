package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listner_class.class)
//to connect with listener class use above annotation and give (packagename.classname.class as extension)

public class Listner_testNGclass {
  @Test
  public void MoneyTransfersuccess() {
	  
	  Reporter.log("Money send succesfully",true);
	  
	 }
 
 /* @Test
  public void MoneyTransfersuccess1()//failed class 
  {
	  Reporter.log("Your money was not send");
  }
  
  @Test
  public void validcredential()//failed class 
  {
	  Assert.fail();
	  Reporter.log("credential are wrong ");
  }
  
  @Test (dependsOnMethods ="validcredential" )
  public void MoneyTransfersuccess2()//method is skipped
  {
	  Reporter.log("money transfer is skipped because of wrong credential ");
  }*/
}
