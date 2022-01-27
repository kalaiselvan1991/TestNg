package org.test.adactinhotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="location")
		private WebElement loc;
		
		@FindBy(id="hotels")
		private WebElement hotel;
		
		@FindBy(id="room_type")
		private WebElement roomtype;
		
		@FindBy(id="room_nos")
		private WebElement numbofroom;
		
		@FindBy(id="datepick_in")
		private WebElement chkin;
		
		@FindBy(id="datepick_out")
		private WebElement chkout;
		
		@FindBy(id="adult_room")
		private WebElement adults;
		
		@FindBy(id="child_room")
		private WebElement child;
		
		@FindBy(id="Submit")
		private WebElement btnsubmit;

		public WebElement getLoc() {
			return loc;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoomtype() {
			return roomtype;
		}

		public WebElement getNumbofroom() {
			return numbofroom;
		}

		public WebElement getChkin() {
			return chkin;
		}

		public WebElement getChkout() {
			return chkout;
		}

		public WebElement getAdults() {
			return adults;
		}

		public WebElement getChild() {
			return child;
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}

}
