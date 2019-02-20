package testng.demo;

import org.testng.annotations.Test;

public class BrowserTest {
	@Test(priority=3)
	public void GoogleTest() {
		System.out.println("google Test");
	}

	@Test(priority=2,enabled=false)
	public void LinkedInTest() {
		System.out.println("LinkedIn Test");
	}

	@Test(priority=1)
	public void AccentureTest() {
		System.out.println("Accenture Test");
	}
}
