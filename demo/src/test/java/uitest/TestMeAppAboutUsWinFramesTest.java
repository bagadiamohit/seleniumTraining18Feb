package uitest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class TestMeAppAboutUsWinFramesTest {
	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";
	TestMeAppLoginTest login;
	TestMeAppWinFramePageRepo pageRep;
	TestMeAppLogoutTest logout;
	
	@BeforeTest
	public void beforeTest() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//implicit wait
		login = new TestMeAppLoginTest(driver);
		pageRep = PageFactory.initElements(driver, TestMeAppWinFramePageRepo.class);
	}


	@Test
	public void winFrames() throws Exception {
		login.loginTestMeApp();
		pageRep.navigationMenu();
		pageRep.switchToWin();
		pageRep.switchTo2Frame();
		pageRep.addressCapture();
		pageRep.switchTo1Frame();
		logout = new TestMeAppLogoutTest(driver);
		logout.logoutTestMeApp();
	}


	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser");
		driver.quit();
	}

}
