package uitest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMeAppLoginTest {
	
	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";
	String userName="user2002";
	String password="Password123";
	TestMeAppSignUpPageRepo obj;
	TestMeAppLoginPageRepo obj1;
	ScreenShotGeneric ss;
	String testCaseName="TestMeAppLoginTest";
	
	public TestMeAppLoginTest(WebDriver driver){
		this.driver=driver;
	}
	
	@BeforeTest
	public void beforeMethod() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void loginTestMeApp() throws Exception{
		obj = PageFactory.initElements(driver, TestMeAppSignUpPageRepo.class);
		obj1 = PageFactory.initElements(driver, TestMeAppLoginPageRepo.class);
		obj1.signInLink();
		obj.setUid(userName);
		obj.setPwd(password);
		obj1.loginClick();
		obj1.signOutLinkEnableCheck();
		ss.captureScreenshot(driver, "Login Test", testCaseName);
	}
	
	public WebDriver returnDriver(){
		return driver;
	}
	
	@AfterTest
	public void afterMethod() {
		System.out.println("Closing the browser");
		driver.quit();
	}
}
