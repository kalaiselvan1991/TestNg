package org.test.projectjan12;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class Facebook extends BaseClass {
	
	public  Facebook() {
		PageFactory.initElements(driver, this);
		}
	
	  @FindBy (id="email")
	private  WebElement txtuser; 
	  @FindBy (id= "pass")
	private  WebElement txtpass;
	  @FindBy (name="login")
	private  WebElement clickbtn;
	  
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getClickbtn() {
		return clickbtn;
	} 
	
	  
	  

}


