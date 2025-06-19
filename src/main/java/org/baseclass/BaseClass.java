package org.baseclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	private static final int OutputType = 0;
	public static WebDriver driver;
public static void browserLaunch(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
	else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	}
public static void urlLaunch(String url) {
	
	driver.get(url);
	driver.manage().window().maximize();
}
public static void impWait(long sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
public static void sendkeys(WebElement e,String value) {
	e.sendKeys(value);
}
public static void click(WebElement e) {
	e.click();
}
public static String getText(WebElement e) {
String t = e.getText();
return t;
}
public static String  getAttribute(WebElement e) {
String att = e.getAttribute("value");
return att;
}
public static String   currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}
public static void quit() {
driver.quit();
}
//actions
public static void movetoelement(WebElement t) {
	Actions a=new Actions(driver);
	a.moveToElement(t).build().perform();
}

public static void dragandDrop(WebElement src, WebElement tgt) {
	Actions a=new Actions(driver);
a.dragAndDrop(src, tgt).build().perform();
}
//select
public static  void selectbyIndex(WebElement e,int i) {
	Select s=new Select(e);
	s.selectByIndex(i);

}
public static void deselectbyIndex(WebElement e,int i) {
	Select s=new Select(e);
	s.deselectByIndex(i);
}
//task
public static void close() {
	driver.close();
}
public static void contextclick(WebElement c) {
	Actions a=new Actions(driver);
	a.contextClick(c).build().perform();
}
public static  void doubleclick(WebElement d) {
	Actions a=new Actions(driver);
	a.doubleClick(d).build().perform();
}
public static void selectbyValue(WebElement e,String value) {
	Select s=new Select(e);
	s.selectByValue(value);
}
public static void selectbyVisibleText(WebElement e,String text) {
	
	Select s=new Select(e);
	s.selectByVisibleText(text);
}

public static void deselectbyValue(WebElement e,String value) {
	Select s=new Select(e);
	s.deselectByValue(value);
}
public static void deselectbyVisibleText(WebElement e,String text) {
	
	Select s=new Select(e);
	s.deselectByVisibleText(text);
}
public static boolean isMultiple(WebElement e) {
	Select s=new Select(e);
 return s.isMultiple();
}
public static void deselectAll(WebElement e) {
	Select s=new Select(e);
	s.deselectAll();
}
public static String WindowHandle(WebElement e) {
String windowHandle = driver.getWindowHandle();
return windowHandle;
}
public static Set<String> WindowHandles(WebElement e,String values) {
	Set<String> value = driver.getWindowHandles();
	return value;
}
public static  void Accept() {
	Alert a1=driver.switchTo().alert();
a1.accept();
}
public static  void Dismiss() {
	Alert a1=driver.switchTo().alert();
a1.dismiss();
}
public static  void Frames(int index) {
driver.switchTo().frame(index);

}
}



