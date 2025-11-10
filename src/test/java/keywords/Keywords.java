package keywords;

import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords {
//	1.invocationCount keyword
	
//  @Test(invocationCount = 2)
//  public void a()
//  {
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://www.coverfox.com/");
//  }
  
//	2.priority keyword
	
//  @Test(priority = -1)
//   public void login()
//  {
//	  Reporter.log("login test", true);
//  }
//  
// @Test(priority = 1)
//  public void signIn()
//  {
//	  Reporter.log("signIn test", true);
//  }
//
// @Test(priority = 9)
// public void payment()
// {
//	  Reporter.log("payment test", true);
// }
	
//	3.enabled keyword
	
//	@Test(enabled = true)
//	public void logOut()
//	{
//		Reporter.log("logOut test", true);
//	}
	
//	4.timeOut keyword
	
//	@Test(timeOut = 2000)
//	public void logIn1() throws InterruptedException
//	{
//		Thread.sleep(1000);
//		Reporter.log("logIn1 test", true);
//	}
	
//	5.dependsOnMethods keyword
	
	@Test(dependsOnMethods = {"b"})
	public void a()
	{
		Reporter.log("test a", true);
	}
	
	@Test
	public void b()
	{
		Assert.fail();
		Reporter.log("test b", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("test c", true);
	}


}
