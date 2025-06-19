package org.sample;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPage;
import org.pom.RegistrationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
public static void main(String[] args) {
	browserLaunch("chrome");
	urlLaunch("https://www.facebook.com/");
	impWait(10);
	LoginPage l=new LoginPage();
	
	sendkeys(l.getTxtUser(),"sivapriya");
	sendkeys(l.getTxtpass(),"2468");
	click(l.getBtnlogin());
	

}
}
