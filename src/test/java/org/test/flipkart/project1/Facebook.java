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
<<<<<<< HEAD
	@Test
	private void test() throws InterruptedException {
		launchUrl("https://in.bookmyshow.com/explore/movies?gclid=EAIaIQobChMIuoG97PHe9QIVWZJmAh3znAsBEAAYASAAEgIXz_D_BwE");
//		FacebookLogin f=new FacebookLogin();
//		sendKeys(f.getTxtuser(), "kalaiselvan143");
//		sendKeys(f.getTxtpass(), "12345");
		Thread.sleep(5000);
=======

	@Test
	private void test() {
		FacebookLogin f=new FacebookLogin();
		sendKeys(f.getTxtuser(), "kalaiselvan143");
		sendKeys(f.getTxtpass(), "34567890123");
		click(f.getLoginbtn());

>>>>>>> b04de43485d9d7f7dc9fea00f44bb3f10304253a
	}
}
