package org.test.amazon;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;
import org.test.flipkart.project1.FirstPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		launchBrowser("chrome");
//		maximize();
		implicitWait(20);
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Before Method="+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("After Method="+d);
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
	}
	@Test
	private void test() throws InterruptedException {
		launchUrl("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement txtsrchbox = findElement("xpath", "//input[@id='twotabsearchtextbox']");
		txtsrchbox.sendKeys("iphone");
		
		WebElement srchbtn = findElement("xpath", "//input[@id='nav-search-submit-button']");
		srchbtn.click();

				
//				Map<String,String> m=new HashMap();
				
				List<WebElement> allname = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
				
				
//				for (int i = 0; i <allname.size(); i++) {
					
//					WebElement product = allname.get(i);
//					String name = product.getText();
//					System.out.println(name);
					
//				}
				
				
				List<WebElement> allprice = driver.findElements(By.xpath("(//span[@class='a-price-whole'])"));
				
//				for (int i = 0; i < allprice.size(); i++) {
					
				
//				WebElement price = allprice.get(i);
//				String text = price.getText();
//				String replace = text.replace(",", " ");
//				
//				System.out.println(replace);
				
//				}
			
			
			
//				String a= name;
//				String b= replace;
//				String =(integer)String;
		
//		for (int i = 0; i <a.indexOf(a); i++) {
//			System.out.println(a+"  "+b);
			
//		}
		
	
		

	
}}
	

