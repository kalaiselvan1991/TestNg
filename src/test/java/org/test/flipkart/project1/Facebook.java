package org.test.flipkart.project1;

import java.util.Date;

import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		
		launchBrowser("chrome");
		maximize();
		implicitWait(20);
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
	}
	
	private void test() {
		FacebookLogin f=new FacebookLogin();
		sendKeys(f.getTxtuser(), "kalaiselvan143");
		sendKeys(f.getTxtpass(), "12345");
		
	}
}
