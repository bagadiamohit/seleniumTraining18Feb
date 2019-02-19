package uitest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

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

public class RegisterTestMeAppTest {

	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";
	String userName="test12335";
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
	

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void signUpTestMeApp() throws Exception {
		TestMeAppSignUpPageRepo obj = PageFactory.initElements(driver, TestMeAppSignUpPageRepo.class);
		obj.setSignupBtn();
		obj.setUid(userName);
		obj.setfName(firstName);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		boolean flag1 = wait.until(ExpectedConditions.textToBe(By.id("err"), "Available"));
		System.out.println(flag1);
		if(flag1=true){
			Assert.assertTrue(flag1);
		}
		else{
			userName+=1;
			System.out.println("username changed to: "+userName);
			obj.setUid(userName);
		}
		
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

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing the browser");
		//driver.quit();
	}

}
