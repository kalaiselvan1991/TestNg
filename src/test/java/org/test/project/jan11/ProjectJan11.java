package org.test.project.jan11;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.test.adactinhotelapp.AddressPage;
import org.test.adactinhotelapp.BookingPage;
import org.test.adactinhotelapp.CheckingPage;
import org.test.adactinhotelapp.HotelLogin;
import org.test.adactinhotelapp.OrderConfirm;
import org.test.baseclass.BaseClass;
import org.test.project.jan10.MethodsForAddatin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProjectJan11  extends BaseClass {
	
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
	
	@Test(priority = 1,dataProvider = "login",dataProviderClass = MethodsForAddatin.class,groups = "smoke")
	private void login(String user, String pass) throws InterruptedException {
		
		launchUrl("http://adactinhotelapp.com/index.php");
		
		HotelLogin h=new HotelLogin();
		
	sendKeys(h.getTxtusername(), user);
	
	sendKeys(h.getTxtpass(), pass);

	clickbtn(h.getBtnlogin());
	
		thread(3000);

	}
	
	@Test(priority = 2,dataProvider = "booking",dataProviderClass = MethodsForAddatin.class,groups = "smoke")
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
		
		thread(3000);
		
		
	}
	@Test(priority = 3,groups = "smoke")
	private void booking1() {
		
		BookingPage b=new BookingPage();
		clickbtn(b.getBtnsubmit());

	}	

	
	@Test(priority = 4,groups = "smoke")
	private void checking() throws InterruptedException {
		
CheckingPage c=new CheckingPage();
		
		clickbtn(c.getRdbtn());
		
		clickbtn(c.getBtncont());
		
		thread(3000);

	}
	
	@Test(priority = 5 ,dataProvider = "address",dataProviderClass = MethodsForAddatin.class,groups = "smoke")
	private void address(String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
		
		AddressPage a=new AddressPage();
		clear(a.getTxtfname());
		sendKeys(a.getTxtfname(), name);
		
		clear(a.getTxtlname());
		sendKeys(a.getTxtlname(), lname);
		
		clear(a.getTxtaddress());
		sendKeys(a.getTxtaddress(), address);
		
		clear(a.getTxtccno());
		sendKeys(a.getTxtccno(), ccno);
		
		WebElement cct = a.getCctype();
		SelectbyValue(cct, "VISA");
		
		WebElement ccmon2 = a.getCcmon();
		SelectbyValue(ccmon2, "3");
		
		WebElement ccyear2 = a.getCcyear();
		SelectbyValue(ccyear2, "2022");
		
		clear(a.getCcvnumb());
		sendKeys(a.getCcvnumb(), cvv);
		
		thread(3000);
		
		
		}
	@Test(priority = 6,groups = "smoke")
	private void address1() {
		AddressPage a=new AddressPage();
		
		clickbtn(a.getBtnbooknow());

	}
	@Test(priority = 7,groups = "smoke")
	private void confirm() throws InterruptedException {
		
		OrderConfirm o=new OrderConfirm();
		
		WebElement orderno2 = o.getOrderno();
		System.out.println(orderno2.getAttribute("value"));
		
		clickbtn(o.getMyitin());
		
		thread(3000);
	
		
		

	

}

		
			
			

		}


