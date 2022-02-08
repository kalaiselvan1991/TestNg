package org.test.insta;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

//Men Shirt

public class Instagram extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		launchBrowser("chrome");
		implicitWait(30);
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
	}
	@Test(dataProvider = "details",dataProviderClass = Insta.class)
	private void test(String mob,String fname,String uname,String pass ) throws InterruptedException {
		
		launchUrl("https://www.instagram.com/?hl=en");
		
		WebElement signupbtn = driver.findElement(By.xpath("//span[text()='Sign up']"));
		signupbtn.click();
		
		Thread.sleep(2000);
		
		WebElement txtmob = driver.findElement(By.name("emailOrPhone"));
		txtmob.sendKeys(mob);
		
		WebElement txtfname = driver.findElement(By.name("fullName"));
		txtfname.sendKeys(fname);
		
		WebElement txtuname = driver.findElement(By.name("username"));
		txtuname.sendKeys(uname);
		
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys(pass);
		
		WebElement crtbtn = driver.findElement(By.xpath("//button[text()='Sign up']"));
		crtbtn.click();
		
		
	}

}
