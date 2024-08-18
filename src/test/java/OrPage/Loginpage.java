package OrPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents {
	
@FindBy(xpath="//h1")
public WebElement Heading;

@FindBy(xpath="/html/body/main/div/div/div[2]/section[2]/div/div/div[1]/div[2]/p")
public WebElement Zohoparagrah;

@FindBy(xpath="//div[@class='zgh-nav']/ul/li[4]")
public WebElement Company;

@FindBy(xpath="//li[@class='nav-menu active']//a[contains(text(),'Our story')]")
public WebElement OurStory;

@FindBy(xpath="/html/body/main/div/div/div[2]/section[1]/div[1]/p")
public WebElement Paragraph;

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public static String gettext(WebElement element,String Text) {
	String str=element.getText();
	return Text;
}
public static String paragraphtext(WebElement element,String Text) {
	String str=element.getText();
	return Text;
}
public void COMPANY(WebElement element) {
	TechnicalComponents.Clickable(element);
}
public void StoryOur(WebElement element) {
	TechnicalComponents.Clickable(element);
}
public static  boolean Technology(WebElement element) {
	TechnicalComponents.Test(element);
	return true;
}
}
