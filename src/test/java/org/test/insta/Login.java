package org.test.insta;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class Login extends BaseClass {
	
	private void page1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Sign up']")
	private WebElement signupbtn;
	
	@FindBy(name="emailOrPhone")
	private WebElement txtmobile;
	
	@FindBy(name="fullName")
	private WebElement txtfullname;
	
	@FindBy(name="username")
	private WebElement txtusername;
	
	@FindBy(name="password")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement crtbtn;

	public WebElement getSignupbtn() {
		return signupbtn;
	}

	public WebElement getTxtmobile() {
		return txtmobile;
	}

	public WebElement getTxtfullname() {
		return txtfullname;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getCrtbtn() {
		return crtbtn;
	}
	

}
