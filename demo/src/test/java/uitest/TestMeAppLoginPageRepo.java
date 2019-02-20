package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TestMeAppLoginPageRepo {
	
	WebDriver driver;
	@FindBy(name="Login") WebElement loginBtn;
	@FindBy(xpath="//i[@class='fa fa-lock']") WebElement signOut;
	@FindBy(xpath="//a[contains(text(),'SignIn')]") WebElement signInLink;
	
	public TestMeAppLoginPageRepo(WebDriver driver){
		this.driver=driver;
	}
	
	public void loginClick(){
		loginBtn.click();
	}
	
	public void signOutLinkEnableCheck(){
		boolean res = this.signOut.isEnabled();
		System.out.println(res);
		Assert.assertTrue(res);
		System.out.println("User is logged in");
	}
	
	public void signInLink(){
		this.signInLink.click();
	}
	
	public void signOut(){
		signOut.click();
		System.out.println("Signing out...");
	}

}
