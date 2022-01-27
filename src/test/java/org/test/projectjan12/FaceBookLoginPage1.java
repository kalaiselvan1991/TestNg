package org.test.projectjan12;

import java.util.Date;

import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBookLoginPage1 extends BaseClass {
	
	@Parameters("browserName1")
	@BeforeClass
	public void beforeClass(String browserName1) {
		System.out.println("browser name :"+browserName1);
		launchBrowser(browserName1);
	
			}
	
	@AfterClass
	private void afterClass() {
		quitBrowser();
		System.out.println("code done sucessfully");

	}
	@BeforeMethod
	private void beforeMethod() {
		
		Date d=new Date();
		System.out.println("Before method"+ d);

	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("After method"+ d);

	}
	@Test
	private void test() throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		Facebook f=new Facebook();
		sendKeys(f.getTxtuser(), "kalaiselvan143");
		sendKeys(f.getTxtpass(), "12345");
		click(f.getClickbtn());
		thread(8000);
	}

}
