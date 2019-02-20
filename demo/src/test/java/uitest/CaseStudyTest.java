package uitest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaseStudyTest {
	WebDriver driver;
	String browser="chrome";
	String URL="http://10.232.237.143:443/TestMeApp";
	TestMeAppLoginTest login;
	TestMeAppAllCategoriesPageRepo cart;
	TestMeAppLogoutTest logout;
	TestMeAppShoppingCartPageRepo checkout;
	TestMeAppPaymentGatePageRepo payment;
	
	
	@BeforeTest
	public void beforeTest() throws Exception {
		driver=SelectBrowser.setBrowser(browser);
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//implicit wait
		login = new TestMeAppLoginTest(driver);
	}
	
	@Test
	public void productPurchase() throws Exception {
		login.loginTestMeApp();
		cart = PageFactory.initElements(driver, TestMeAppAllCategoriesPageRepo.class);
		cart.addToCart();
		cart.checkCart();
		checkout = PageFactory.initElements(driver, TestMeAppShoppingCartPageRepo.class);
		checkout.proceedToPay();
		payment = PageFactory.initElements(driver, TestMeAppPaymentGatePageRepo.class);
		payment.makePayment();
		logout = new TestMeAppLogoutTest(driver);
		logout.logoutTestMeApp();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser");
		driver.quit();
	}
	
}
