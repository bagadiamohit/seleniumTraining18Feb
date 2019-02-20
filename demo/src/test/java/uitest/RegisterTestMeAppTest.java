package uitest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class RegisterTestMeAppTest {

	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";//"http://10.232.237.143:443/TestMeApp";
	String userName="user2002";
	String firstName="Virat";
	String lastName="Kohli";
	String password="Password123";
	String gender="Male";
	String email="virat@gmail.com";
	String mobileNo="9999999999";
	String month="Apr";
	String year="1989";
	String address="some street, some city, some country";
	int secqind=1;
	String secAns="kuch bhi";
	TestMeAppSignUpPageRepo obj;
	TestMeAppLoginPageRepo obj1;
	

	public RegisterTestMeAppTest(WebDriver driver){
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
	
	@Test(priority=1,enabled=false)
	public void signUpTestMeApp() throws Exception {
		obj.setSignupBtn();
		obj.setUid(userName);
		obj.setfName(firstName);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		boolean flag1 = wait.until(ExpectedConditions.textToBe(By.id("err"), "Available"));
		System.out.println(flag1);
		/*if(flag1==true){
			Assert.assertTrue(flag1);
		}
		else{
			userName+=1;
			System.out.println("username changed to: "+userName);
			obj.setUid(userName);
		}*/
		
		String flag2=driver.findElement(By.id("err")).getText();
		System.out.println(flag2);
		Assert.assertEquals(flag2, "Available");
		
		obj.setlName(lastName);
		obj.setPwd(password);
		obj.setConfPwd(password);
		//((JavascriptExecutor) driver).executeScript("windows.scrollTo(0,document.body.scrollHeight)");
		obj.setGenderRadio(gender);
		obj.setEmail(email);
		obj.setMobileNo(mobileNo);
		obj.setDate(month, year);
		obj.setAddrs(address);
		obj.setSecDropDown(secqind);
		obj.setSecAnswer(secAns);
		obj.setSubmitBtn();
		obj.successMsg();
		Thread.sleep(2000);
	}
	
/*	@Test(priority=2)
	public void loginTestMeApp(){
		obj = PageFactory.initElements(driver, TestMeAppSignUpPageRepo.class);
		obj1 = PageFactory.initElements(driver, TestMeAppLoginPageRepo.class);
		obj1.signInLink();
		obj.setUid(userName);
		obj.setPwd(password);
		obj1.loginClick();
		obj1.signOutLinkEnableCheck();
	}*/
	
/*	@Test(priority=3)
	public void logoutTestMeApp(){
		obj1.signOut();
	}*/

	@AfterTest
	public void afterMethod() {
		System.out.println("Closing the browser");
		driver.quit();
	}

}
