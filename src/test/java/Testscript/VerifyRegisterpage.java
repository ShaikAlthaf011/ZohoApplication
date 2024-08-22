package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyRegisterpage extends BussinessComponents {
@Test
public void VerifyRegisterpage() throws IOException {
	String url=Browser.Open_browser("url");
	Navigateurl(url);
	RegisterTest1();
	RegisterTest2();
	RegisterTest3();
	RegisterTest4();
	RegisterTest5();
	RegisterTest6();
	RegisterTest7();
	RegisterTest8();
	Sales();
	Entervalue();
}
}
