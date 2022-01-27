package org.test.project.jan10;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.test.adactinhotelapp.AddressPage;
import org.test.adactinhotelapp.BookingPage;
import org.test.adactinhotelapp.CheckingPage;
import org.test.adactinhotelapp.HotelLogin;
import org.test.adactinhotelapp.OrderConfirm;
import org.test.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectJan10new  extends BaseClass {
	
	@BeforeClass
	private void brforeClass() {
		
		launchBrowser("chrome");
		
//		maximize();
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
	@Test(priority = 1,dataProvider = "login",dataProviderClass = MethodsForAddatin.class)
	private void login(String user, String pass,String in,String out,String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
		
		launchUrl("http://adactinhotelapp.com/index.php");
		
		HotelLogin h=new HotelLogin();
		
	sendKeys(h.getTxtusername(), user);
	
	sendKeys(h.getTxtpass(), pass);

	clickbtn(h.getBtnlogin());
	
		thread(3000);
		
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
		
		clickbtn(b.getBtnsubmit());
		
		CheckingPage c=new CheckingPage();
		
		clickbtn(c.getRdbtn());
		
		clickbtn(c.getBtncont());
		
		thread(3000);
		
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
		
		clickbtn(a.getBtnbooknow());
		
		OrderConfirm o=new OrderConfirm();
		
		WebElement orderno2 = o.getOrderno();
		System.out.println(orderno2.getAttribute("value"));
		
		clickbtn(o.getMyitin());
		
		thread(3000);
	}
		
		@Test(priority = 2,dataProvider = "address",dataProviderClass = MethodsForAddatin.class)
		private void address(String user, String pass,String in,String out,String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
			
			launchUrl("http://adactinhotelapp.com/index.php");
			
			HotelLogin h=new HotelLogin();
			
		sendKeys(h.getTxtusername(), user);
		
		sendKeys(h.getTxtpass(), pass);

		clickbtn(h.getBtnlogin());
		
			thread(3000);
			
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
			
			clickbtn(b.getBtnsubmit());
			
			CheckingPage c=new CheckingPage();
			
			clickbtn(c.getRdbtn());
			
			clickbtn(c.getBtncont());
			
			thread(3000);
			
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
			
			clickbtn(a.getBtnbooknow());
			
			OrderConfirm o=new OrderConfirm();
			
			WebElement orderno2 = o.getOrderno();
			System.out.println(orderno2.getAttribute("value"));
			
			clickbtn(o.getMyitin());
			
			thread(3000);
		}
		
		@Test(priority = 3,dataProvider = "booking",dataProviderClass = MethodsForAddatin.class)
		private void booking(String user, String pass,String in,String out,String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
			
			launchUrl("http://adactinhotelapp.com/index.php");
			
			HotelLogin h=new HotelLogin();
			
		sendKeys(h.getTxtusername(), user);
		
		sendKeys(h.getTxtpass(), pass);

		clickbtn(h.getBtnlogin());
		
			thread(3000);
			
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
			
			clickbtn(b.getBtnsubmit());
			
			CheckingPage c=new CheckingPage();
			
			clickbtn(c.getRdbtn());
			
			clickbtn(c.getBtncont());
			
			thread(3000);
			
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
			
			clickbtn(a.getBtnbooknow());
			
			OrderConfirm o=new OrderConfirm();
			
			WebElement orderno2 = o.getOrderno();
			System.out.println(orderno2.getAttribute("value"));
			
			clickbtn(o.getMyitin());
			
			thread(3000);
		}
		
		@Test(priority = 4,dataProvider = "date",dataProviderClass = MethodsForAddatin.class)
		private void date(String user, String pass,String in,String out,String name,String lname,String address,String ccno,String cvv) throws InterruptedException {
			
			launchUrl("http://adactinhotelapp.com/index.php");
			
			HotelLogin h=new HotelLogin();
			
		sendKeys(h.getTxtusername(), user);
		
		sendKeys(h.getTxtpass(), pass);

		clickbtn(h.getBtnlogin());
		
			thread(3000);
			
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
			
			clickbtn(b.getBtnsubmit());
			
			CheckingPage c=new CheckingPage();
			
			clickbtn(c.getRdbtn());
			
			clickbtn(c.getBtncont());
			
			thread(3000);
			
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
			
			clickbtn(a.getBtnbooknow());
			
			OrderConfirm o=new OrderConfirm();
			
			WebElement orderno2 = o.getOrderno();
			System.out.println(orderno2.getAttribute("value"));
			
			clickbtn(o.getMyitin());
			
			thread(3000);
		}
		
}
