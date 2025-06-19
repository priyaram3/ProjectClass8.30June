package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup()
    @FindBys({ @FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
    private WebElement txtUser;
	
	@CacheLookup()
    @FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@name='pass']")})
	private WebElement txtpass;
	
	@CacheLookup()
    @FindBy(name="login")
   private WebElement btnlogin;

	public WebElement getTxtUser() {
	return txtUser;
}

	public WebElement getTxtpass() {
	return txtpass;
}

	public WebElement getBtnlogin() {
	return btnlogin;
} 

	
	
	
	
	
	
	
	
	
	
	
}
