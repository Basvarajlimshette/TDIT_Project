package tditsolutions.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tdit.utils.Elementutil;

public class UpdateAccount extends Pages {

	WebDriver driver;

	By accNumber = By.xpath("//input[@id='myInput']");

	By newfund = By.xpath("//input[@name='afund']");

	By updatebalbutton = By.xpath("//button[text()='Update balance']");

	By updateAccountTitle = By.xpath("//h2[text()='Update Balance']");

	By homepagebutton = By.tagName("a");

	By searchInput = By.xpath("//input[@name='accnumber']");

	By Searchbutton = By.xpath("//button[@name='search']");

	By searchText = By.xpath("//h2[text()='Search']");

	By validaText = By.xpath("//td[text()='Sachin']");
	
	By WelcomeMsg=By.xpath("//h3[contains(text(),'Welcome')]");
	
	By sharePrice=By.xpath("//tr[9]/td[3]");
	
	
	
	Elementutil elementutil;
	Pages page;
	
	public UpdateAccount(WebDriver driver) {
		super(driver);
		this.driver = driver;
		elementutil=new Elementutil(driver);
	}


	public void upadteAccount(String number, String fund) {
		
		elementutil.EneterText(accNumber, number);
		elementutil.EneterText(newfund, fund);
		
//		driver.findElement(accNumber).sendKeys(number);
//		driver.findElement(newfund).sendKeys(String.valueOf(fund));
	}
	
	public void clickOnUpdateBalanceBtn() {
		elementutil.click(updatebalbutton);
		
//		driver.findElement(updatebalbutton).click();

	}

	public String getUpdatepageTitle() {
		
		String updateAccTitle=elementutil.getText(updateAccountTitle);
		
//		String updateAccTitle = driver.findElement(updateAccountTitle).getText();
		return updateAccTitle;
	}

	public boolean IsAlertPresent() {
		
		return page.isAlertPresent();
	}

	public String getAlertText() {
		
		String alertText = driver.switchTo().alert().getText();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		return alertText;
	}

	public void searchOfAccount(String number) {
		
		elementutil.EneterText(searchInput, number);
        elementutil.click(Searchbutton);
        
//		driver.findElement(searchInput).sendKeys(number);
//		driver.findElement(Searchbutton).click();
	}
	
	
	public String presenceOfAccount() {
		
		return elementutil.getText(validaText);
		
//		String actualText = driver.findElement(validaText).getText();
//		return actualText;
	}

	public HomePage homePageButton() {
		driver.findElement(homepagebutton).click();
		return new HomePage(driver);
	}
	
	public String sharesupdate() {
		
		return elementutil.getText(sharePrice);
		
//		String shareprice=driver.findElement(sharePrice).getText();
//		return shareprice;
	}
	
	
   public String getAttributevalue() {
	   
	   return elementutil.getAttributevalue(newfund,"value");
	   
//	   String value=driver.findElement(newfund).getAttribute("value");
//	   return value;
   }
   
   public String getAttributeMessage() {
	  
	   
	    return driver.findElement(newfund).getAttribute("validationMessage");

   }
   







}
