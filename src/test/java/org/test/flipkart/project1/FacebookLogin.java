package org.test.flipkart.project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class FacebookLogin extends BaseClass {
	
	private void firstPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="email")
	WebElement txtuser;
	
	@FindBy(id="pass")
	WebElement txtpass;
	
	@FindBy(name="login")
	WebElement loginbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
