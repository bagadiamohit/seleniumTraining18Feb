package uitest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TestMeAppPaymentGatePageRepo {
	WebDriver driver;
	String username="123456";
	String pwd="Pass@456";
	String transPass="Trans@456";
	ScreenShotGeneric ss;
	String testCaseName="Making payment";
	@FindBy(xpath="//h2[contains(text(),'Welcome to Payment Gateway -')]") WebElement successMsg;
	@FindBy(xpath="//input[@name='radio1' and @value='Andhra Bank']") WebElement andhraBankRadio;
	@FindBy(id="btn") WebElement continueBtn;
	@FindBy(name="username") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='LOGIN']") WebElement loginBtn;
	@FindBy(xpath="//label[contains(text(),'Transaction Password:')]") WebElement transText;
	@FindBy(name="transpwd") WebElement transPasswordFld;
	@FindBy(xpath="//input[@value='PayNow']") WebElement payNowBtn;
	@FindBy(xpath="//p[contains(text(),'Your order has been confirmed')]") WebElement orderCnfMsg;
	
	public TestMeAppPaymentGatePageRepo(WebDriver driver){
		this.driver=driver;
	}
	
	public void makePayment() throws Exception{
		boolean res = successMsg.isEnabled();
		Assert.assertTrue(res);
		System.out.println("Making Payment: "+res);
		//andhraBankRadio.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",andhraBankRadio);
		System.out.println("User has selected the bank as Andhra Bank");
		System.out.println("Proceeding further...");
		ss.captureScreenshot(driver, "selecting Bank", testCaseName);
		continueBtn.click();
		System.out.println("Entering the username and password");
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginBtn.click();
		System.out.println("Please enter the transaction password");
		Assert.assertEquals(transText.getText(), "Transaction Password:");
		transPasswordFld.sendKeys(transPass);
		ss.captureScreenshot(driver, "Before Making Payment", testCaseName);
		System.out.println("Clcicking on the Pay Now Button");
		payNowBtn.click();
			
		Assert.assertEquals(orderCnfMsg.getText(), "Your order has been confirmed");
		System.out.println("Order is confirmed");
		ss.captureScreenshot(driver, "After Making Payment", testCaseName);
	}
	
}
