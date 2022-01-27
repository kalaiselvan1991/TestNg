package org.test.adactinhotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class OrderConfirm extends BaseClass {
	
	public OrderConfirm() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderno;
	
	@FindBy(id="my_itinerary")
	private WebElement myitin;

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getMyitin() {
		return myitin;
	}

}
