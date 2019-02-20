package uitest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TestMeAppWinFramePageRepo {
	
	WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'AboutUs')]") WebElement aboutUs;
	@FindBy(xpath="//span[contains(text(),'Our Offices')]") WebElement ourOfficeMenu;
	@FindBy(xpath="//span[contains(text(),'Chennai')]") WebElement chennaiMenu;
	@FindBy(name="menu_page") WebElement firstFrame;
	@FindBy(name="main_page") WebElement secondFrame;
	@FindBy(id="demo3") WebElement address;
	
	
	public TestMeAppWinFramePageRepo(WebDriver driver){
		this.driver=driver;
	}
	
	public void navigationMenu(){
		Actions act = new Actions(this.driver);
		act.moveToElement(aboutUs).moveToElement(ourOfficeMenu).moveToElement(chennaiMenu).click().build().perform();
	}
	
	public void switchToWin(){
		Set<String> set=driver.getWindowHandles();
		
		for(String winchange:set){
			driver.switchTo().window(winchange);
		}
	}
	
	public void switchTo2Frame(){
		driver.switchTo().frame(secondFrame);
	}
	
	public void switchTo1Frame(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame(firstFrame);
	}
	
	public WebDriver addressCapture(){
		String addr = address.getText();
		System.out.println(addr);
		return driver;
	}
	
/*	public WebDriver returnDriver(){
		return this.driver;
	}*/
}
