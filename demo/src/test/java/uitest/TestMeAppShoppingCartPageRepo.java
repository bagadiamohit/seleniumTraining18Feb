package uitest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestMeAppShoppingCartPageRepo {
	WebDriver driver;
	ScreenShotGeneric ss;
	String testCaseName="proceedToPay";
	@FindBy(xpath="//a[contains(text(),'Cart')]") WebElement cartLink;
	@FindBy(id="demo") WebElement successMsg;
	@FindBy(xpath="//a[@class='btn btn-success btn-block']") WebElement checkOutBtn;
	@FindBy(xpath="//input[@value='Proceed to Pay']") WebElement proceedPay;
	
	public TestMeAppShoppingCartPageRepo(WebDriver driver){
		this.driver=driver;
	}
	
	public void proceedToPay() throws Exception{
		System.out.println("Clicking on the cart link and proceeding further...");
		cartLink.click();
		ss.captureScreenshot(driver, "Opening Cart", testCaseName);
		boolean res = successMsg.isDisplayed();
		System.out.println("Product is present in the cart. Proceeding further .... "+res);
		checkOutBtn.click();
		ss.captureScreenshot(driver, "CheckOut Button Clicked", testCaseName);
		proceedPay.click();
		ss.captureScreenshot(driver, "Proceed to Pay", testCaseName);
	}
}
