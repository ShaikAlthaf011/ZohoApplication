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

}
