package org.test.projectjan12;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBookLoginPage extends BaseClass {
	
	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		System.out.println("browser name :"+browserName);
		launchBrowser(browserName);
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
