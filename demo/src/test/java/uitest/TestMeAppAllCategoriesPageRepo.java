package uitest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class TestMeAppAllCategoriesPageRepo {
	
	WebDriver driver;
	ScreenShotGeneric ss;
	@FindBy(xpath="//span[contains(text(),'All Categories')]") WebElement allCat;
	@FindBy(xpath="//span[contains(text(),'Electronics')]") WebElement electronics;
	@FindBy(xpath="//span[contains(text(),'Head Phone')]") WebElement headPhone;
	@FindBy(xpath="//a[@class='btn btn-success btn-product']") WebElement addToCartBtn;
	@FindBy(xpath="//h4[contains(text(),'Headphone')]") WebElement successMsg;
	@FindBy(xpath="//a[contains(text(),'Cart')]") WebElement cartSym;
	
	public TestMeAppAllCategoriesPageRepo(WebDriver driver){
		this.driver=driver;
	}
	
	public void addToCart() throws Exception{
		Actions act = new Actions(driver);
		act.moveToElement(allCat).click().perform();
		act.moveToElement(electronics).click().perform();
		act.moveToElement(headPhone).click().perform();
		Assert.assertEquals(successMsg.getText(), "Headphone");
		System.out.println("Navigation successfull... Proceeding to Add to Cart");
		addToCartBtn.click();
		System.out.println("Add to cart is successful!!!");
		ss.captureScreenshot(driver, "Add to cart", "Cart");
	}
	
	public void checkCart() throws Exception{
		boolean res = cartSym.isEnabled();
		Assert.assertTrue(res);
		System.out.println("Product added to cart: "+res);
		//cartSym.click();
		//ss.captureScreenshot(driver, "Click on cart", "Cart");
	}
	
}
