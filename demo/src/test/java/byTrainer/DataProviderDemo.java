package byTrainer;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "loginData")
  public void UserLogin(String userName, String password) {
	  System.out.println("user name : "+userName+"\t\t Password : "+password);
  }

  @DataProvider
  public Object[][] loginData() {
	  Object[][] data= {
				{"Swapnali","1234"},
				{"Vikrant","1122"},
			 };

return data;
  }
}
