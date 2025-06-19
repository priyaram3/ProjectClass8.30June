package org.sample;

import org.baseclass.BaseClass;
import org.pom.RegistrationPage;

public class BrowserLaunch1 extends BaseClass {
	public static void main(String[] args) {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		impWait(10);
		RegistrationPage l=new RegistrationPage();
		 click(l.getBtnnew());
		 sendkeys(l.getFirstname(),"sivapriya");
		 sendkeys(l.getSurname(),"sriram");
		selectbyIndex(l.getDay(), 18);
       selectbyIndex(l.getMonth(),1);
       selectbyVisibleText(l.getYear(),"1993");
       click(l.getGender());
       sendkeys(l.getMobileno(),"9176642996");
       sendkeys(l.getNewpass(),"kirshanth14");
       click(l.getSignup());
	}
}
