package OrPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Registerpage extends TechnicalComponents {
    @FindBy(xpath="//div[@class='zgh-nav']/ul/li[4]")
    public WebElement Company;
    
    @FindBy(xpath="/html/body/main/div/div/div[1]/div/div/div[2]/ul/li[4]/div/ul/li[8]/a")
    public WebElement LongGame;
    
    @FindBy(xpath="//strong")
    public WebElement Strong;
    
    @FindBy(xpath="//h2[@class='lg-post-title']")
    public WebElement analyst;
    
    @FindBy(xpath="//ul[@class='lg-related-post-links']//a[contains(text(),'Growth')]")
    public WebElement Growth;
    
    @FindBy(xpath="//input[@changeitem='SIGNUP_FORM_FIELD']")
    public WebElement Email;
    
    @FindBy(xpath="//select[@id='zcf_address_country']")
    public WebElement Selected;
    
    @FindBy(xpath="//*[@id='zcWebOptin']")
    public WebElement Submit;
    
    @FindBy(xpath="/html/body/div[2]/section[2]/div/ul/li[5]/a")
    public WebElement SalesMarketing;
    
    @FindBy(xpath="/html/body/div[2]/section[3]/div/ul/li[1]/h2/a")
    public WebElement Textsalesmarketing;
    
	public Registerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   public void Test1(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public void Test2(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public static String stringText(WebElement element,String Text) {
	   String str=TechnicalComponents.Text(element, Text);
	   return str;
   }
   public static String Test3(WebElement element,String Text) {
	String str=TechnicalComponents.Text(element,Text);
	 return str;
   }
   public void growth(WebElement element) {
	   TechnicalComponents.Clickable(element);
	}
   public void EmailAdress(WebElement element,String Text) {
	   TechnicalComponents.sendkeys(element, Text);
   }
   public void Selected(WebElement element,String Text) {
	   TechnicalComponents.valueSelected(element, Text);
   }
   public void submit(WebElement element) {
	   TechnicalComponents.Clickable(element);
	}
   public void Marketing(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public void Testsignificans(WebElement element) {
	   TechnicalComponents.Clickable(element);
	   
   }
}
