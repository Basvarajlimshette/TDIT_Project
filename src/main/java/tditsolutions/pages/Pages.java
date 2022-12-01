package tditsolutions.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tdit.utils.Elementutil;

public class Pages {
	
	
	WebDriver driver;
	static Elementutil elementutil;
	
	public Pages(WebDriver driver) {
		
		this.driver=driver;
		elementutil=new Elementutil(driver);
		
	}
	
	
	public static boolean isAlertPresent() {
		
		return elementutil.waitforAlert();

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		try {
//			wait.until(ExpectedConditions.alertIsPresent());
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
	}
	
	
	
	
	
	
	

}
