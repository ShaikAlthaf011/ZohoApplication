package ReusableComponents;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import BrowserConfiguration.ExtentFactory;
import OrPage.Loginpage;
import OrPage.Registerpage;
import dev.failsafe.internal.util.Durations;


public class BussinessComponents extends TechnicalComponents {
public static Loginpage lp;
public static Registerpage rg;

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
public void Testcase6() {
	lp=new Loginpage(driver);
String str=lp.textmethod(lp.DealManagement,"Close more deals in less time. Track what stage your deals are currently in, and seize every opportunity at the optimal moment.");
System.out.println(str);
if(str.equals("Close more deals in less time. Track what stage your deals are currently in, and seize every opportunity at the optimal moment.")) {
	System.out.println("Test case is Passed");
}else {
	System.out.println("Test case is Failed");
}
}
public void Testcase7() {
	lp=new Loginpage(driver);
	lp.Funcation(lp.learnmore);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Features Mouse Hover Actions");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Testcase8() {
	lp=new Loginpage(driver);
	lp.bigin(lp.Bigin);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click in the Bigin");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Testcase9() {
	lp=new Loginpage(driver);
	String str1=lp.Customersupport(lp.CustomerOperation,"Sales deals, support tickets, customer onboarding, order delivery, customer testimonials, contracts, and everything in between—Bigin is all you need to streamline your customer operations in one platform. Get started in under 30 minutes.");
	Assert.assertEquals(str1,"Sales deals, support tickets, customer onboarding, order delivery, customer testimonials, contracts, and everything in between—Bigin is all you need to streamline your customer operations in one platform. Get started in under 30 minutes.");
}
public void Testcase10() {
	lp=new Loginpage(driver);
	lp.customer(lp.Customers);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click in the Customers");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Register() {
	rg=new Registerpage(driver);
}
public void RegisterTest1() {
	rg=new Registerpage(driver);
	rg.Test1(rg.Company);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the Company");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void RegisterTest2() {
	rg=new Registerpage(driver);
	rg.Test2(rg.LongGame);
}
public void RegisterTest3() {
	rg=new Registerpage(driver);
	String str=rg.stringText(rg.Strong,"Perspectives on building businesses, from the road less traveled");
	System.out.println(str);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the Company");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
	
}
public void RegisterTest4() {
	rg=new Registerpage(driver);
	String str=rg.Test3(rg.analyst,"Cross-learnings #1: from international athlete to analyst relations");
	Assert.assertEquals(str,"Cross-learnings #1: from international athlete to analyst relations");
}
public void RegisterTest5() {
	rg=new Registerpage(driver);
	rg.growth(rg.Growth);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the Company");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void RegisterTest6() {
	rg=new Registerpage(driver);
	rg.EmailAdress(rg.Email,"altushaik@gmail.com");
}
public void RegisterTest7() {
	rg=new Registerpage(driver);
	rg.Selected(rg.Selected,"Ghana");
}
public void RegisterTest8() {
	rg=new Registerpage(driver);
	rg.submit(rg.Submit);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the submit");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Sales() {
	rg=new Registerpage(driver);
	rg.Marketing(rg.SalesMarketing);
	
}
public void Entervalue() {
	rg=new Registerpage(driver);
	rg.Testsignificans(rg.Textsalesmarketing);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the submit");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
}


