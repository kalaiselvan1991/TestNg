package org.test.flipkart.project1;

import java.util.Date;
import java.util.Set;

import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartProject extends BaseClass{
	
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("CODE STARTED SUCESSFULLY");
		launchBrowser("edge");
		maximize();
		implicitWait(20);
	 }
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("BEFORE METHOD"+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("AFTER METHOD"+d);
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
		System.out.println("CODE WORKING DONE SUCESSFULLY");
	}
	@Test
	private void test() throws Exception {
		
	 FirstPage f=new FirstPage();
	 launchUrl("https://www.flipkart.com/");
	 click(f.getClosebtnlogin());
	 Thread.sleep(3000);
	 sendKeys(f.getTxtsrch(), "mobiles");
	 click(f.getSrchbtn());
	 Thread.sleep(3000);
	 String parrentid = driver.getWindowHandle();
	 System.out.println("parrentid------"+parrentid+"------");
	 click(f.getImagebtn());
	 Thread.sleep(3000);
	 SecondPage s=new SecondPage();
	 Set<String> allids = driver.getWindowHandles();
	 System.out.println("allids------"+allids+"------");
	 
	for (String eachid : allids) {
		if (!parrentid.equals(allids)) {
		switchToWindowHandle(eachid);
		System.out.println("eachid------"+eachid+"------");}
	}	
	 Thread.sleep(2000);
	 clear(s.getTxtpincode());
	 Thread.sleep(2000);
	 sendKeys(s.getTxtpincode(), "600075");
	 Thread.sleep(2000);
	 click(s.getCheckbtn());
	 click(s.getAddtocartbtn());
	 String text = getText(s.getPricedetails());
	 System.out.println(text);
	 click(s.getPlaceorderbtn());
	 Thread.sleep(3000);
	 
	 
	 
	 
	 
	 
		
	

	}
	}

