package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyLoginpage extends BussinessComponents {
@Test
public void VerifyLoginpage() throws IOException {
	String url=Browser.Open_browser("url");
	Navigateurl(url);
	ZohoText();
	Paragraph();
	Currenturl();
	c();
	Story();
	Bussiness();
	Customers();
	Analtics();
	Clickablemore();
	window();
	gettextmethod();
}
}
