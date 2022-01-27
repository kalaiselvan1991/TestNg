package org.test.test.test;

import java.util.Date;

import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestTest extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		
//		launchBrowser("chrome");
//		maximize();
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Before Time"+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("After Time"+d);
	}
	@Test(groups = "smoke")
	private void login() {
		launchBrowser("chrome");
		maximize();
		launchUrl("https://www.google.com/");

	}

}
