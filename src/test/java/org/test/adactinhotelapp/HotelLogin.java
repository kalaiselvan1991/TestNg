package org.test.adactinhotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class HotelLogin extends BaseClass {
	
	public HotelLogin(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
