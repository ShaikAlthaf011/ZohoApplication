package ReusableComponents;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import BrowserConfiguration.Browser;

public class TechnicalComponents extends Browser {
public static void Verifying(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
public static String takescreenshot() {
	String filepath="";
	try {
		ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		String screenshotName=(d.getDate() < 10 ? "0" + d.getDate() : d.getDate()) + " " + 
	            (d.getMonth() + 1 < 10 ? "0" + (d.getMonth() + 1) : (d.getMonth() + 1)) + "_" + 
	            (1900 + d.getYear()) + "_" + 
	            (d.getHours() < 10 ? "0" + d.getHours() : d.getHours()) + "_" + 
	            (d.getSeconds() < 10 ? "0" + d.getSeconds() : d.getSeconds());
		filepath=System.getProperty("user.dir")+"/reports/screenshot/"+screenshotName+".jpg";
	    Files.copy(f,  new File(filepath));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return filepath;
}
public static void Clickable(WebElement element) {
	element.click();
}
public static void sendkeys(WebElement element,String Text) {
	element.sendKeys(Text);
}
public static String Text(WebElement element,String Text) {
	element.getText();
	return Text;
}
public static void Test(WebElement element) {
	boolean b=element.isDisplayed();
}
public static void WindowHandles() {
	Set<String>S=driver.getWindowHandles();
	Iterator<String>it=S.iterator();
	String firstwindow=it.next();
	String secondwindow="";
	while(it.hasNext()) {
		secondwindow=it.next();
		break;
	}
	driver.switchTo().window(secondwindow);
}
}
