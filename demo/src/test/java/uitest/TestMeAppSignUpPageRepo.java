package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class TestMeAppSignUpPageRepo {
	
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'SignUp')]") WebElement signupBtn;
	@FindBy(id="demo1") WebElement validateText;
	@FindBy(name="userName") WebElement uid;
	@FindBy(name="firstName") WebElement fName;
	@FindBy(name="lastName") WebElement lName;
	@FindBy(name="password") WebElement pwd;
	@FindBy(name="confirmPassword") WebElement confPwd;
	@FindBy(xpath="//input[@name='gender' and @value='Male']") WebElement malegenderRadio;
	@FindBy(xpath="//input[@name='gender' and @value='Female']") WebElement femalegenderRadio;
	@FindBy(name="emailAddress") WebElement email;
	@FindBy(name="mobileNumber") WebElement mobileNo;
	@FindBy(xpath="//img[@class='ui-datepicker-trigger']") WebElement datePickBtn;
	@FindBy(xpath="//select[@data-handler='selectMonth']") WebElement datePickMonth;
	@FindBy(xpath="//select[@data-handler='selectYear']") WebElement datePickYear;
	@FindBy(xpath="//a[contains(text(),'20')]") WebElement datePickDay;
	@FindBy(name="address") WebElement addrs;
	@FindBy(xpath="//select[@name='securityQuestion']") WebElement secDropDown;
	@FindBy(name="answer") WebElement secAnswer;
	@FindBy(name="Submit") WebElement submitBtn;
	@FindBy(xpath="//div[@id='errormsg']/following-sibling::div[3]") WebElement successMsg;
	
	public TestMeAppSignUpPageRepo(WebDriver driver) {
		this.driver = driver;
	}

	public void setSignupBtn() {
		signupBtn.click();
		System.out.println("Clicked on the SignUp button");
		Assert.assertEquals(validateText.getText(), "Registration");
		System.out.println("User is on the Registration page. Proceeding further....");
	}

	public void setUid(String uid) {
		System.out.println("Entering the username");
		this.uid.sendKeys(uid);
	}

	public void setfName(String fName) {
		System.out.println("Entering the first name");
		this.fName.sendKeys(fName);
	}

	public void setlName(String lName) {
		System.out.println("Entering the lastname");
		this.lName.sendKeys(lName);
	}

	public void setPwd(String pwd) {
		System.out.println("Entering the password");
		this.pwd.sendKeys(pwd);
	}

	public void setConfPwd(String confPwd) {
		System.out.println("Entering the conf password");
		this.confPwd.sendKeys(confPwd);
	}

	public void setGenderRadio(String genderRadio) {
		System.out.println("Selecting the gender");
		/*Select gender = new Select(this.genderRadio);
		gender.selectByVisibleText(genderRadio);*/
		if (genderRadio=="Male"){
			this.malegenderRadio.click();
		}
		else if (genderRadio=="Female"){
			this.femalegenderRadio.click();
		}
		else
			this.malegenderRadio.click();
	}

	public void setEmail(String email) {
		System.out.println("Entering the email");
		this.email.sendKeys(email);
	}

	public void setMobileNo(String mobileNo) {
		System.out.println("Entering the mobile no");
		this.mobileNo.sendKeys(mobileNo);
	}

	public void setDate(String month, String year) {
		System.out.println("Selecting the date");
		this.datePickBtn.click();
		Select mon = new Select(this.datePickMonth);
		mon.selectByVisibleText(month);
		Select yr = new Select(this.datePickYear);
		yr.selectByVisibleText(year);
		this.datePickDay.click();
	}

	public void setAddrs(String addrs) {
		System.out.println("Entering the Address");
		this.addrs.sendKeys(addrs);
	}

	public void setSecDropDown(int qind) {
		System.out.println("Selecting the security question");
		this.secDropDown.click();
		Select index = new Select(this.secDropDown);
		index.selectByIndex(qind);
	}

	public void setSecAnswer(String secAnswer) {
		System.out.println("Entering the Secret Answer");
		this.secAnswer.sendKeys(secAnswer);
	}

	public void setSubmitBtn() {
		System.out.println("Clicking on the submmit button");
		this.submitBtn.click();
	}
	
	public void successMsg(){
		Assert.assertEquals(this.successMsg.getText(), "User Registered Succesfully!!! Please login");
		System.out.println(this.successMsg.getText());
	}
	
}
