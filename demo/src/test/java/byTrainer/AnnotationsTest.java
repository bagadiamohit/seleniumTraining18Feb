package byTrainer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTest {
	 @BeforeSuite
	  public void beforeSuite() {
		 System.out.println("beforeSuite");
	  }
	
	 @BeforeClass
	  public void beforeClass() {
		 System.out.println("beforeClass");
	  }
	
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("beforeMethod");
	  }
	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("beforeTest");
	  }

	 @Test(priority=1)
	  public void LinkedInTest() {
		  System.out.println("LinkedIn Test");
	  }
	  
	  @Test(priority=2)
	  public void FacebookTest() {
		  System.out.println("Facebook Test");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuite");
	  }
  /*
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
*/
}
