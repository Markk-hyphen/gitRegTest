package pageClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTestss {
	  @Test
	  public void f() {
		  System.out.println("pollo test");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("pollo beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("pollo afterClass");
	  }
}
