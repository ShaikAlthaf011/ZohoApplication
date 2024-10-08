package OrPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents {
	@FindBy(xpath="//h1")
    public WebElement heading;
	
	@FindBy(xpath="//div[@class='zgh-nav']/ul/li[1]")
	public WebElement Products;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div/div/div[2]/ul/li[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/ul/li[1]")
	public WebElement CRM;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div[2]/ul/li[1]/a")
	public WebElement features;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div[2]/ul/li[1]/ul/li[14]/a")
	public WebElement AllFeature;
	
	@FindBy(xpath="//*[@id='salesforce-automation']/div/div[2]/p")
	public WebElement DealManagement;
	
	@FindBy(xpath="//div[@id='salesforce-automation']/div/div[3]/a")
	public WebElement learnmore;
	
	@FindBy(xpath="//ul[@class='summary_Lst']/li")
	public WebElement CustomerRelationship;
	
	@FindBy(xpath="//a[contains(text(),'Bigin')]")
	public WebElement Bigin;
	
	@FindBy(xpath="//div[@class='bgn-hdr-content']/p")
	public WebElement CustomerOperation;
	
	@FindBy(xpath="/html/body/header/div[3]/div/div[2]/div/ul/li[5]/a")
	public WebElement Customers;
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public static String Text_heading(WebElement element,String Text) {
		String str=TechnicalComponents.Text(element,Text);
		return str;
	}
	public void crm(WebElement element) {
		TechnicalComponents.Clickable(element);
	}
   public void FEATURES(WebElement element) {
	   TechnicalComponents.MouseHover(element);
   }
   public void FeatureAll(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public static String textmethod(WebElement element,String Text) {
	   String str1=TechnicalComponents.Text(element, Text);
	   return str1;
	}
   public void Funcation(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public void bigin(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public static String Customersupport(WebElement element,String Text) {
	   String str=TechnicalComponents.Text(element, Text);
	   return str;
   }
   public void customer(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
  
}
