package org.test.amazon;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class AmazonFirst extends BaseClass {
	
	private void firstPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement txtsrchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement srchbtn;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> iphone;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	private List<WebElement> price;

	public WebElement getTxtsrchbox() {
		return txtsrchbox;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

	public List<WebElement> getIphone() {
		return iphone;
	}

	public List<WebElement> getPrice() {
		return price;
	}
	
	
	
	

}
