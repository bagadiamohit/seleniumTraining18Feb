package uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class uiTestFormPageRepo {

	WebDriver driver;
	@FindBy(id="firstname") WebElement firstName;
	@FindBy(id = "lastname") WebElement lastName;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/form/div[3]/label[2]/input") WebElement marStatus;
	@FindBy(xpath = "//input[@value='dance']") WebElement danceHobby;
	@FindBy(xpath= "//input[@value='cricket']") WebElement cricketHobby;
	@FindBy(id = "sel1") WebElement country;
	@FindBy(id ="datepicker") WebElement datePicker;
	@FindBy(xpath = "//option[@value='2']") WebElement selectMonth;
	@FindBy(xpath = "//option[@value='2017']") WebElement selectYear;
	@FindBy(xpath= "//a[contains(text(),'17')]") WebElement selectDate;
	@FindBy(id = "phonenumber") WebElement phoneNumber;
	@FindBy(id="username") WebElement userName;
	@FindBy(id = "email") WebElement email;
	@FindBy(id="comment") WebElement comment;
	@FindBy(id="pwd") WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") WebElement submitBtn;

	public void uiTestFormPageRepo(WebDriver driver) {
		this.driver = driver;
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public void setMarStatus() {
		marStatus.click();
	}
	public void setDanceHobby() {
		danceHobby.click();
	}
	public void setCricketHobby() {
		cricketHobby.click();
	}
	public void setCountry() {
		country.click();
	}
	public void setDate() {
		datePicker.click();
		selectMonth.click();
		selectYear.click();
		selectDate.click();
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}
	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public void setComment(String comment) {
		this.comment.sendKeys(comment);
	}
	public void setPwd(String pwd) {
		this.pwd.sendKeys(pwd);
	}
	public void setSubmitBtn() {
		submitBtn.click();
	}
}
