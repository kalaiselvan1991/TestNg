package org.test.baseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static  WebDriver driver ;
	
	public static  WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();}
		else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();}
		else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();}
		return driver;}
	
	public static  void launchUrl (String url) {
		driver.get(url);
		}
	public static  String title() {
		return driver.getTitle();
		}
	public static void quitBrowser() {
	driver.quit();
	}
	public static String currentUrl() {
		return  driver.getCurrentUrl();

	}
	
	public static void close() {
		driver.close();
	}
	public static WebElement findElement(String locatorname, String loc) {
		WebElement e=null;
		if(locatorname.equalsIgnoreCase("id")) {
			e=driver.findElement(By.id(loc));
		}
		else if(locatorname.equalsIgnoreCase("name")) {
			e=driver.findElement(By.name(loc));
		}
		else if(locatorname.equalsIgnoreCase("classname")) {
			e=driver.findElement(By.className(loc));
		}
		else if(locatorname.equalsIgnoreCase("xpath")) {
			e=driver.findElement(By.xpath(loc));
		}
		else if(locatorname.equalsIgnoreCase("tagname")) {
			e=driver.findElement(By.tagName(loc));
		}
		else if(locatorname.equalsIgnoreCase("linktext")) {
			e=driver.findElement(By.linkText(loc));
		}
		else if(locatorname.equalsIgnoreCase("partiallinktext")) {
			e=driver.findElement(By.partialLinkText(loc));
		}
		else if(locatorname.equalsIgnoreCase("cssselector")) {
			e=driver.findElement(By.cssSelector(loc));
		}
		return e;}
	
		public static TargetLocator switchTo() {
			return driver.switchTo();
		}
			
	public static void implicitWait(long sec ) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static String switchToWindowHandle (String titlenameid) {
		driver.switchTo().window(titlenameid);
		return titlenameid;
	}

	
	public static String getText(WebElement t ) {
	String sy= t.getText();
	return sy;
	}
	public static void clear(WebElement clear) {
		clear.clear();
	}	
	public static void clickbtn(WebElement click) {
		click.click();
	}
	public static String getAttribute(WebElement getattribute) {
		String st=getattribute.getAttribute("value");
		return st;
	}
	public static Dimension getSize(WebElement getsize) {
		Dimension gs = getsize.getSize();
		return gs;
	}
	public static String getTagname(WebElement tagname) {
		String tg = tagname.getTagName();
		return tg;
	}
	public static void sendKeys (WebElement sk, String value) {
	sk.sendKeys(value);
}
	public static void submit (WebElement w) {
	w.submit();
}
	public static void wait(WebElement wa) throws InterruptedException {
	wa.wait();
}
	public static void waitLong(WebElement wt,long longs) throws InterruptedException {
	wt.wait(longs);
}
	public static void waitTimeout(WebElement wt,long long1,int int1) throws InterruptedException {
	wt.wait(long1, int1);
}
	public static void movetoElement(WebElement target) {
	Actions a=new Actions(driver);
a.moveToElement(target).perform();
}
	public static void doubleClick(WebElement dc) {
		Actions a=new Actions(driver);
		a.doubleClick(dc).perform();
	}
	public static void contextClick(WebElement ct) {
		Actions a=new Actions(driver);
		a.contextClick(ct).perform();
	}
	public static void clickandHold(WebElement ch) {
		Actions a=new Actions(driver);
		a.clickAndHold(ch).perform();
	}
	public static void dragandDrop(WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
}
	public static void click(WebElement clk) {
		Actions a=new Actions(driver);
		a.click(clk).perform();
}
	public static void maximize() {
	driver.manage().window().maximize();
}
	public static List<WebElement> findElements(String locatorname, String loc) {
		List<WebElement>d=null;
		WebElement e =null;
		if(locatorname.equalsIgnoreCase("id")) {
			e=driver.findElement(By.id(loc));
			return (List<WebElement>) d;	
		}
		else if(locatorname.equalsIgnoreCase("name")) {
			e=driver.findElement(By.name(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("Classname")) {
			e=driver.findElement(By.className(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("xpath")) {
			e=driver.findElement(By.xpath(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("tagname")) {
			e=driver.findElement(By.tagName(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("linktext")) {
			e=driver.findElement(By.linkText(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("partiallinktext")) {
			e=driver.findElement(By.partialLinkText(loc));
			return (List<WebElement>) d;
		}
		else if(locatorname.equalsIgnoreCase("cssselector")) {
			e=driver.findElement(By.cssSelector(loc));
			return (List<WebElement>) d;
		}
		return d;

}
	public static void SelectbyIndex(WebElement web,int i) {
		
		Select s=new Select(web);
		s.selectByIndex(i);
		}
	
public static void SelectbyValue(WebElement web1,String value) {
		
		Select s=new Select(web1);
		s.selectByValue(value);
		}
	
public static void SelectbyVisibletext(WebElement web1,String text) {
	
	Select s=new Select(web1);
	s.selectByVisibleText(text);
	}
	
	public static void thread(long mills) throws InterruptedException {
		Thread.sleep(mills);
	}
	
	
	public static String getAttribute() {
		WebElement s=null;
		return s.getAttribute("value");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
