package assertionStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
@Test
  public void a()
  {
	  String a="test";
	  String b="test1";
	  Assert.assertEquals(a,b,"a and b are not equal TC failed");
  }
  
  @Test
  public void b()
  {
	  String a="test";
	  String b="test1";
	  Assert.assertNotEquals(a,b,"a and b are not equal TC failed");
  }
	
	@Test
	 public void c()
	  {
		  boolean result=true;
		  Assert.assertTrue(result, "result is false TC failed");
	  }
	
	@Test
	 public void d()
	  {
		  boolean result=true;
		  Assert.assertFalse(result, "result is true TC failed");
	  }


}
