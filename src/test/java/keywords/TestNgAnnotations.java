package keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
  @Test
  public void a_resultValadation()
  {
	  Reporter.log("a_running result validation", true);
  }
  
  @Test
  public void z_resultValadation()
  {
	  Reporter.log("z_running result validation new", true);
  }
  
  @BeforeMethod
  public void provideAddressDetails()
  {
	  Reporter.log("providing pincode and mobile num", true);
  }
  
  @AfterMethod
  public void clearHistory()
  {
	  Reporter.log("clearing browser history", true);
  }
  
  @BeforeClass
  public void provideMemberDetails()
  {
	  Reporter.log("providing member details", true);
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("before test running", true);
  }
  
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("after test running", true);
  }
  
  @BeforeSuite
  public void beforeSuit()
  {
	  Reporter.log("before suit running", true);
  }
  
  @AfterSuite
  public void afterSuit()
  {
	  Reporter.log("after suit running", true);
  }
}
