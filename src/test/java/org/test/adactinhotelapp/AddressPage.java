package org.test.adactinhotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class AddressPage extends BaseClass {
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@id='first_name']")
		private WebElement txtfname;
		
		@FindBy(xpath="//input[@id='last_name']")
		private WebElement txtlname;
		
		@FindBy(xpath="//textarea[@id='address']")
		private WebElement txtaddress;
		
		@FindBy(xpath="//input[@id='cc_num']")
		private WebElement txtccno;
		
		@FindBy(xpath="//select[@id='cc_type']")
		private WebElement cctype;
		
		@FindBy(xpath="//select[@id='cc_exp_month']")
		private WebElement ccmon;
		
		@FindBy(xpath="//select[@id='cc_exp_year']")
		private WebElement ccyear;
		
		@FindBy(xpath="//input[@id='cc_cvv']")
		private WebElement ccvnumb;
		
		@FindBy(xpath="//input[@id='book_now']")
		private WebElement btnbooknow;

		public WebElement getTxtfname() {
			return txtfname;
		}

		public WebElement getTxtlname() {
			return txtlname;
		}

		public WebElement getTxtaddress() {
			return txtaddress;
		}

		public WebElement getTxtccno() {
			return txtccno;
		}

		public WebElement getCctype() {
			return cctype;
		}

		public WebElement getCcmon() {
			return ccmon;
		}

		public WebElement getCcyear() {
			return ccyear;
		}

		public WebElement getCcvnumb() {
			return ccvnumb;
		}

		public WebElement getBtnbooknow() {
			return btnbooknow;
		}
		

}
