package selenium.demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvideDemo {
  @Test(dataProvider = "dp")
  public void f(String userName, String password) {
	  System.out.println(userName+"\t \t "+password);
  }

  @DataProvider
  public Object[][] dp() {
    Object[][] data = {
    		{"Mohit","1234"},{"Surabhi", "2345"}
    };
    return data;
  }
}
