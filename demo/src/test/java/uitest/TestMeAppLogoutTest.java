package uitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMeAppLogoutTest {
	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";
	TestMeAppLoginPageRepo obj1;
	TestMeAppLoginTest obj2;

	public TestMeAppLogoutTest(WebDriver driver){
		this.driver=driver;
	}

	@BeforeTest
	public void beforeMethod() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj2 = new TestMeAppLoginTest(driver);
		obj2.loginTestMeApp();
		driver=obj2.returnDriver();
	}


	@Test
	public void logoutTestMeApp() {	
		obj1 = PageFactory.initElements(driver, TestMeAppLoginPageRepo.class);
		obj1.signOut();
	}
	
	@AfterTest
	public void afterMethod() {
		System.out.println("Closing the browser");
		driver.quit();
	}
}
