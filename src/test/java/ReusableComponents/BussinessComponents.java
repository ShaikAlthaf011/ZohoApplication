package ReusableComponents;

import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import BrowserConfiguration.ExtentFactory;
import OrPage.Loginpage;


public class BussinessComponents extends TechnicalComponents {
public static Loginpage lp;
public static void Navigateurl(String url) {
	TechnicalComponents.Verifying(url);
	lp=new Loginpage(driver);
	
	ExtentFactory.getInstance().getExtent().log(Status.PASS," is entered in your name field");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void ZohoText() {
	lp=new Loginpage(driver);
String str=lp.gettext(lp.Heading," A unique and powerful software suite to transform the way you work. Designed for businesses of all sizes, built by a company that");
String str1=" A unique and powerful software suite to transform the way you work. Designed for businesses of all sizes, built by a company that";
if(str.equals(str1)) {
	System.out.println("Test case is Passed");
}else {
	System.out.println("Test case is Failed");
}
}
public void Paragraph() {
	lp=new Loginpage(driver);
	String str=lp.gettext(lp.Zohoparagrah,"Run your entire business on Zoho with our unified cloud software, designed to help you break down silos between departments and increase organizational efficiency.");
	System.out.println(str);
}
public void Currenturl() {
	lp=new Loginpage(driver);
	String str="https://www.zoho.com/";
	if(driver.getTitle().equals("Zoho | Cloud Software Suite for Businesses")) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}
	
	if(driver.getCurrentUrl().equals(str)) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}

}
public void c() {
	lp=new Loginpage(driver);
	lp.COMPANY(lp.Company);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Company is Clickable");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Story() {
	lp=new Loginpage(driver);
	lp.COMPANY(lp.OurStory);
}
public void Bussiness() {
	lp=new Loginpage(driver);
	boolean b=lp.Technology(lp.Paragraph);
	if(b) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}
}
public void Customers() {
	lp=new Loginpage(driver);
	lp.CUSTOMERS(lp.customers);
}
public void Analtics() {
	lp=new Loginpage(driver);
	lp.ZohoAnalytical(lp.Analytical);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Customer is Clickable");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Clickablemore() {
	lp=new Loginpage(driver);
	lp.MoreRead(lp.Readmore);
}
public void window() {
	lp=new Loginpage(driver);
	lp.WindowHandles();
	}
public void gettextmethod() {
	lp=new Loginpage(driver);
	String str=lp.YAGNA(lp.Yagna,"Zoho Analytics offers comprehensive insights into the operational and managerial aspects for Yagna iQ");
    System.out.println(str);
    ExtentFactory.getInstance().getExtent().log(Status.PASS,"Customer is Clickable");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
}
