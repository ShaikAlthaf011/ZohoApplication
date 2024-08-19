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
	if(driver.getTitle().equals("Zoho | Cloud Software Suite for Businesses")) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}
	String str="https://www.zoho.com/";
	if(driver.getCurrentUrl().equals(str)){
		System.out.println("Test case is Passed");
		}else {
			System.out.println("Test case is Failed");
		}
	ExtentFactory.getInstance().getExtent().log(Status.PASS," is entered in your name field");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Testcase1() {
	lp=new Loginpage(driver);
	String str=lp.Text_heading(lp.heading,"A unique and powerful software suite to transform the way you work. Designed for businesses of all sizes, built by a company that ");
    String str1="A unique and powerful software suite to transform the way you work. Designed for businesses of all sizes, built by a company that ";
	System.out.println(str);
    if(str.equals(str)) {
    	System.out.println("Test case is Passed");
    }else {
    	System.out.println("Test case is Failed");
    }
}
public void Testcase2() {
	lp=new Loginpage(driver);
	lp.Clickable(lp.Products);
}
public void Testcase3() {
	lp=new Loginpage(driver);
	lp.crm(lp.CRM);
	ExtentFactory.getInstance().getExtent().log(Status.PASS," is entered in your name field");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Testcase4() {
	lp=new Loginpage(driver);
	lp.FEATURES(lp.features);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Features Mouse Hover Actions");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Testcase5() {
	lp=new Loginpage(driver);
	lp.FeatureAll(lp.AllFeature);
	
}
}
