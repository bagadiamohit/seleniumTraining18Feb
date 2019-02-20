package byTrainer;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class BrowserTest1 {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		driver=Drivers.getDriver("firefox");
		driver.manage().window().maximize();
	  }
  @Test
  public void ChromeTest() {
	  //http://newtours.demoaut.com
	  //driver.get("www.linkedin.com");
  }
  
  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
