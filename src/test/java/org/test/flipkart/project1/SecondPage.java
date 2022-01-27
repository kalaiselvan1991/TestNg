package org.test.flipkart.project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class SecondPage extends BaseClass {
 
	public SecondPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='pincodeInputId']")
	private WebElement txtpincode;
	
	@FindBy(xpath="//span[@class='_2P_LDn']")
	private WebElement checkbtn;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//div[@class='_I_XQO']")
	private WebElement pricedetails;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeorderbtn;

	public WebElement getTxtpincode() {
		return txtpincode;
	}

	public WebElement getCheckbtn() {
		return checkbtn;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getPricedetails() {
		return pricedetails;
	}

	public WebElement getPlaceorderbtn() {
		return placeorderbtn;
	}
	
	
}
