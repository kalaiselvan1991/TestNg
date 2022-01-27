package org.test.project.jan06;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.test.adactinhotelapp.AddressPage;
import org.test.adactinhotelapp.BookingPage;
import org.test.adactinhotelapp.CheckingPage;
import org.test.adactinhotelapp.HotelLogin;
import org.test.adactinhotelapp.OrderConfirm;
import org.test.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Projectjan0601 extends BaseClass {
	
	@BeforeClass
	private void brforeClass() {
		
		launchBrowser("chrome");
		maximize();
		implicitWait(10);
		
	}
	@AfterClass
private void afterClass() {
		quitBrowser();

}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("BEFORE TIME"+d);

	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("AFTER TIME"+d);

	}
	@Parameters({"username","password"})
	@Test(priority = 1,invocationCount = 1)
	private void login(String user, String pass) throws InterruptedException {
		
launchUrl("http://adactinhotelapp.com/index.php");
	SoftAssert s=new SoftAssert();
	String url = currentUrl();
	boolean contains = url.contains("adactinhotelapp");
	s.assertTrue(contains, "verify url");
	
		
		HotelLogin h=new HotelLogin();
		
	sendKeys(h.getTxtusername(), user);
	String attribute = getAttribute(h.getTxtusername());
	s.assertEquals(attribute, "kalaiselvan123","verify textusername");
	
	sendKeys(h.getTxtpass(), pass);
	String att = getAttribute(h.getTxtpass());
	Assert.assertEquals(att, "kalai1991","verify txtpassword");
	clickbtn(h.getBtnlogin());
	
		thread(3000);
		s.assertAll();
	}
	@Parameters({"in","out"})
	@Test(priority = 2,invocationCount = 1)
	private void booking(String in,String out) throws InterruptedException {
		
		BookingPage b=new BookingPage();
		
		
		WebElement loca = b.getLoc();
		SelectbyVisibletext(loca, "London");
		
		WebElement hote = b.getHotel();
		SelectbyVisibletext(hote, "Hotel Sunshine");
		
		WebElement room = b.getRoomtype();
		SelectbyVisibletext(room, "Super Deluxe");
		
		WebElement numbo = b.getNumbofroom();
		SelectbyValue(numbo, "2");
	   
		clear(b.getChkin());
		sendKeys(b.getChkin(), in);
		
		
		clear(b.getChkout());
		sendKeys(b.getChkout(), out);
		
		
		WebElement adu = b.getAdults();
		SelectbyValue(adu, "3");
		
		WebElement chi = b.getChild();
		SelectbyValue(chi, "2");
		
		clickbtn(b.getBtnsubmit());
		
		thread(3000);
		
		

	}
	@Test(priority = 3,invocationCount = 1)
	private void checking() throws InterruptedException {
		
CheckingPage c=new CheckingPage();
		
		clickbtn(c.getRdbtn());
		
		clickbtn(c.getBtncont());
		
		thread(3000);

	}
	@Parameters({"fname","lname","address","cardno","cvvno"})
	@Test(priority = 4,invocationCount = 1)
	private void address(String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
		
AddressPage a=new AddressPage();
		
		sendKeys(a.getTxtfname(), name);
		
		sendKeys(a.getTxtlname(), lname);
		
		sendKeys(a.getTxtaddress(), address);
		
		sendKeys(a.getTxtccno(), ccno);
		
		WebElement cct = a.getCctype();
		SelectbyValue(cct, "VISA");
		
		WebElement ccmon2 = a.getCcmon();
		SelectbyValue(ccmon2, "3");
		
		WebElement ccyear2 = a.getCcyear();
		SelectbyValue(ccyear2, "2022");
		
		sendKeys(a.getCcvnumb(), cvv);
		
		clickbtn(a.getBtnbooknow());
		
		thread(3000);

	}
	@Test(priority = 5,invocationCount = 1)
	private void confirm() throws InterruptedException {
		
		OrderConfirm o=new OrderConfirm();
		
		WebElement orderno2 = o.getOrderno();
		System.out.println(orderno2.getAttribute("value"));
		
		clickbtn(o.getMyitin());
		
		thread(3000);
	
		
		

	}

}
