package tditsolutions.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import tdit.utils.Elementutil;

public class AddSecurityPage extends Pages{

	By SecurityNum =By.xpath("//input[@id='snumber']");
	By ISINnum = By.xpath("//input[@id='isin']");
	By SEDOLNUM = By.xpath("//input[@id='sedol']");
	By Shares=By.xpath("//input[@value='s']");
	By Launchdate =By.xpath("//input[@id='launch_date']");
	By EODSharePrice =By.xpath("//input[@id='value per share']");
    By Summery =By.xpath("//textarea[@id='summary']");
    By RegisterButton=By.xpath("//button[@name='register']");
		
    WebDriver driver;
    Elementutil elementutil;
    Pages page;
    
    public AddSecurityPage(WebDriver driver) {
    	
        super(driver);
		this.driver=driver;
		elementutil=new Elementutil(driver);
    }
    
    
    
		//page Action
    
    public void addSecurity(String securitynum,String iSInnum,String sedolnum,String date,String shares,String summery) {
    	
    	    elementutil.EneterText(SecurityNum, securitynum);
    	    elementutil.EneterText(ISINnum, iSInnum);
    	    elementutil.EneterText(SEDOLNUM, sedolnum);
    	    elementutil.click(Shares);
    	    elementutil.EneterText(Launchdate, date);
    	    elementutil.EneterText(EODSharePrice, shares);
    	    elementutil.EneterText(Summery, summery);
    	    elementutil.click(RegisterButton);
    	    
//    	    driver.findElement(SecurityNum).sendKeys(securitynum);
//    	    driver.findElement(ISINnum).sendKeys(iSInnum);
//    	    driver.findElement(SEDOLNUM).sendKeys(sedolnum);
//    	    driver.findElement(Shares).click();
//    	    driver.findElement(Launchdate).sendKeys(date);
//    	    driver.findElement(EODSharePrice).sendKeys(shares);
//    	    driver.findElement(Summery).sendKeys(summery);
//    	    driver.findElement(RegisterButton).click();
    	    
    	    
    	    
//    	    util=new Elementutil();
//    	    util.EneterText(SecurityNum,text);
//    	    util.EneterText(ISINnum, text);
//    	    util.EneterText(SEDOLNUM, text);
//    	    util.Enterclick(Shares);
//    	    util.EneterText(Launchdate, "20/05/2025");
//    	    util.scroll();
//    	    util.EneterText(EODSharePrice, "5");
//    	    util.EneterText(Summery, "your shares");
//    	    util.Enterclick(RegisterButton);
    
    }
    
    
		
		public   boolean IsAlertPresent() {
			
			return Pages.isAlertPresent();
			
//			WebDriverWait wait=new WebDriverWait(driver,5);
//		    try {
//		    	wait.until(ExpectedConditions.alertIsPresent());
//		    	return true;
//		    }
//		    catch(NoAlertPresentException e)
//		    {
//		    	e.printStackTrace();
//		    	return false;
//		    }
//		    catch(Exception e1)
//		    {
//		    	return false;
//		    }
		}
	
		
		public String getAlertText() {
			
			String alertmsg= driver.switchTo().alert().getText();
			return alertmsg;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
