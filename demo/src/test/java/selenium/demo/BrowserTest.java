package selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class BrowserTest {
	WebDriver driver;
	
	@Test
	public void ChromeTest() {
		System.out.println("\n\n");
		System.out.println("Entering the username");
		driver.findElement(By.name("userName")).sendKeys("demo");
		System.out.println("Entering the password");
		driver.findElement(By.name("password")).sendKeys("demo");
		System.out.println("Clicking on the Login button");
		driver.findElement(By.name("login")).click();
		System.out.println("Validating whether the user is able to login");
		Assert.assertEquals(driver.findElement(By.linkText("SIGN-OFF")).getText(),"SIGN-OFF");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Initializing the setup...");
		System.out.println("Setting the chromedriver path");
		System.setProperty("webdriver.chrome.driver", "C:\\Mohit\\drivers\\chromedriver.exe");
		System.out.println("Creating a chromedriver object");
		driver = new ChromeDriver();
		System.out.println("launching the application under test");
		driver.get("http://www.newtours.demoaut.com/");
		System.out.println("maximising the window");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser");
		driver.quit();
	}

}
