package org.test.flipkart.project1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class FirstPage extends BaseClass {
	
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closebtnlogin;

	@FindBy (xpath="//input[@name='q']")
	private WebElement txtsrch;

	@FindBy (xpath="//button[@class='L0Z3Pu']")
	private WebElement srchbtn;

	@FindBy (xpath="(//div[@class='CXW8mj'])[1]")
	private WebElement imagebtn;

	public WebElement getClosebtnlogin() {
		return closebtnlogin;
	}

	public WebElement getTxtsrch() {
		return txtsrch;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

	public WebElement getImagebtn() {
		return imagebtn;
	}
	
	

}









