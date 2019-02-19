package selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@Test(priority=2)
	public void LinkedInTest() {
		System.out.println("LinkedIn Test");
	}

	@Test(priority=1)
	public void AccentureTest() {
		System.out.println("Accenture Test");
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
}
