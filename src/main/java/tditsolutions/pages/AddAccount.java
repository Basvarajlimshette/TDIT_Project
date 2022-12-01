package tditsolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.scene.control.Alert;
import tdit.utils.Elementutil;

public class AddAccount extends Pages{
	
	By addaccountTitle =By.xpath("//h2[text()='Add Account']");
	
	By  accountname =By.xpath("//input[@name='aname']");
	
	By accountNum=By.xpath("//input[@name='anumber']");
	
	By accFund=By.xpath("//input[@name='afund']");
	
	By addAccountButton=By.xpath("//button[@name='register']");
	
	By homePageButton=By.tagName("a");
	
	WebDriver driver;
	Elementutil elementutil;
	Pages page;
	
	public AddAccount(WebDriver driver) {
		super(driver);
		this.driver=driver;
		elementutil=new Elementutil(driver);
	}
	
	
	public void addAccount(String name,String num,String fund) {
		
		elementutil.EneterText(accountname, name);
		elementutil.EneterText(accountNum, num);
		elementutil.EneterText(accFund, fund);
		elementutil.click(addAccountButton);
		
//		driver.findElement(accountname).sendKeys(name);
//		driver.findElement(accountNum).sendKeys(String.valueOf(num));
//		driver.findElement(accFund).sendKeys(String.valueOf(fund));
//		driver.findElement(addAccountButton).click();
	}
	
	public String getaddAccountTitle() {
		
		return elementutil.getText(addaccountTitle);
		
//		String AddAccTitle=driver.findElement(addaccountTitle).getText();
//		return AddAccTitle;
	}
	
	public HomePage homePageButton() {
		driver.findElement(homePageButton).click();
		return new HomePage(driver);
	}
	
	
	public boolean IsAlertPresent() {
		
		return Pages.isAlertPresent();
		
//		WebDriverWait wait =new WebDriverWait(driver,5);
//		try {
//		wait.until(ExpectedConditions.alertIsPresent());
//		return true;
//		}
//		catch(NoAlertPresentException e) {
//			e.printStackTrace();
//	    return false;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return false;
		
	}
	
	public String getalertText() {
		
		String alertmage=driver.switchTo().alert().getText();
		return alertmage;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
