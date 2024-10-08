package ReusableComponents;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
public static String  Text(WebElement element,String Text) {
	element.getText();
	return Text;
}
public static void Test(WebElement element) {
	boolean b=element.isDisplayed();
}
public static void MouseHover(WebElement element) {
	Actions ac=new Actions(driver);
	ac.moveToElement(element).build().perform();
}
public static void Applicationwait(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(100));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public static boolean isselected(WebElement element) {
	boolean b=element.isSelected();
	return b;
}
public static void valueSelected(WebElement element,String Text) {
	Select sc=new Select(element);
	sc.selectByVisibleText(Text);
}
}
