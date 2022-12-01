package tditsolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tdit.utils.Elementutil;

public class DeleteAccount extends Pages {
	
	WebDriver driver;
	
	By InsertaccountNum=By.xpath("//input[@id='myInput']");
	
	By DeleteButton=By.xpath("//button[@name='delete']");
	
	By searchAccNumber=By.xpath("//input[@name='accnumber']");
	
	By searchButton=By.xpath("//button[@name='search']");
	
	By deletepageTitle=By.xpath("//h2[text()='Delete Account']");
	
	By SearchAccTitle=By.xpath("//h2[text()='Search Account']");
	
	By HomePageButton=By.tagName("a");
	
	
	Elementutil elementutil;
	Pages page;
	
	public DeleteAccount(WebDriver driver) {
		super(driver);
		this.driver=driver;
		elementutil=new Elementutil(driver);
	}
	
	
	public void deleteAccount(String number) {
		elementutil.EneterText(InsertaccountNum, number);
		elementutil.click(DeleteButton);
		
//		driver.findElement(InsertaccountNum).sendKeys(number);
//		driver.findElement(DeleteButton).click();
	}
	
	public void SearchDeleteAccount(String number) {
		
		elementutil.EneterText(searchAccNumber, number);
		elementutil.click(searchButton);
		
//		driver.findElement(searchAccNumber).sendKeys(number);
//		driver.findElement(searchButton).click();
	}
	
	public boolean IsAlertPresent() {
		return Pages.isAlertPresent();
		
//		WebDriverWait wait=new WebDriverWait(driver,5);
//		try {
//		wait.until(ExpectedConditions.alertIsPresent());
//		return true;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			return false;
//		}
	}
	
	public String getAlertText() {
		
	String AlertText=driver.switchTo().alert().getText();
	return AlertText;
	}
	
	public String getDeteAccountPageTitle() {
		
		return elementutil.getText(deletepageTitle);
		
//		String PageTitile=driver.findElement(deletepageTitle).getText();
//		return PageTitile;
	}
	
	public HomePage ClickOnHomePageButton() {
		driver.findElement(HomePageButton).click();
		return new HomePage(driver);
	}
	
	
	
	
	
	

}
