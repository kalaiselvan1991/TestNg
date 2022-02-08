package org.test.insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;

public class Method123 extends BaseClass{
	
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		launchUrl("https://www.instagram.com/?hl=en");
		implicitWait(20);
		WebElement signupbtn = driver.findElement(By.xpath("//span[text()='Sign up']"));
		signupbtn.click();
		
		
	}

}
