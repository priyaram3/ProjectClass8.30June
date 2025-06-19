package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']") 
	private WebElement btnnew;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement surname;
	
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement gender;
	@FindBy(name="reg_email__")
	private WebElement mobileno;
	@FindBy(name="reg_passwd__")
	private WebElement newpass;
	@FindBy(name="websubmit")
	private WebElement signup;
	
	public WebElement getSignup() {
		return signup;
	}

	public WebElement getNewpass() {
		return newpass;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getBtnnew() {
		return btnnew;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getSurname() {
		return surname;
	}
	
	
	
}
