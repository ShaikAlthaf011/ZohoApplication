package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import BrowserConfiguration.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyLoginpage extends BussinessComponents {
@Test
public void VerifyLoginpage() throws IOException, InterruptedException {
	String url=Browser.Open_browser("url");
	Navigateurl(url);
	Testcase1();
	Testcase2();
	Testcase3();
	Testcase4();
	Testcase5();
	Testcase6();
	Testcase7();
	Testcase8();
	Testcase9();
	Testcase10();
	
}
}