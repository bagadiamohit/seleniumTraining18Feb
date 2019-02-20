package uitest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class FillFormTest {
	WebDriver driver;
	String browser="chrome";
	String URL="http://uitestpractice.com/Students/Form";
	String firstName="Mohit";
	String lastName="Kumar";
	String phoneNumber="9987451245";
	String userName="test19022019";
	String email="test@t1902.com";
	String comment="Mah lyf mah rulzz!!";
	String pwd="Password@123";

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(3000);
	}

	@Test
	public void fillForm() throws Exception {
		uiTestFormPageRepo obj = PageFactory.initElements(driver, uiTestFormPageRepo.class);
		System.out.println("passing driver");
		System.out.println("Entering Firstname");
		obj.setFirstName(firstName);
		obj.setLastName(lastName);
		obj.setMarStatus();
		obj.setDanceHobby();
		obj.setCricketHobby();
		obj.setCountry();
		obj.setDate();
		obj.setPhoneNumber(phoneNumber);
		obj.setUserName(userName);
		obj.setEmail(email);
		obj.setComment(comment);
		obj.setPwd(pwd);
		obj.setSubmitBtn();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
