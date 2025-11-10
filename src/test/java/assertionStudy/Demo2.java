package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2 {
  @Test
  public void e()
  {
	  String url=null;
	  Assert.assertNotNull(url, "url is null TC failed");
  }
  
  @Test
  public void f()
  {
	  String url=null;
	  Assert.assertNull(url, "url is not null TC failed");
  }
  
  @Test
  public void g()
  {
	  Assert.fail();
  }
  
  @Test
  public void h()
  {
	  String url=null;
	  Assert.assertNotNull(url, "url is null TC failed");
	  String a="test";
	  String b="test1";
	  Assert.assertEquals(a,b, "a and b not equal TC failed");
  }
  
  SoftAssert softAssert=new SoftAssert();
  @Test
  public void i()
  {
	  String url=null;
	  softAssert.assertNotNull(url, "url is null TC failed");
	  String a="test";
	  String b="test1";
	  softAssert.assertEquals(a,b, "a and b not equal TC failed");
	  softAssert.assertAll();
	  
  }

  
}
