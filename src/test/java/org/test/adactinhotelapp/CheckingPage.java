package org.test.adactinhotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class CheckingPage extends BaseClass {
	
	public CheckingPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="radiobutton_0")
		private WebElement rdbtn;
		
		@FindBy(id="continue")
		private WebElement btncont;

		public WebElement getRdbtn() {
			return rdbtn;
		}

		public WebElement getBtncont() {
			return btncont;
		}

}
