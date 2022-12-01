package tditsolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tdit.utils.Elementutil;

public class HomePage extends Pages{
	
	By addsecurity= By.xpath("//a[text()='Add Security']");
	
	By addaccount=By.xpath("//a[text()='Add Account']");
	
	By WelcomeMsg=By.xpath("//h3[contains(text(),'Welcome')]");
	
	By updateaccount =By.xpath("//a[text()='Update Account']");
	
	By DeleteAccount= By.xpath("//a[text()='Delete Account']");
	
	By HomepageTitle=By.xpath("//h2[text()='TDIT Solutions ']");
	
	WebDriver driver;
	Elementutil elementutil;
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		elementutil=new Elementutil(driver);
	}
	
	
	public AddSecurityPage clickOnAddSecurity() {
		
		driver.findElement(addsecurity).click();
		return new AddSecurityPage(driver);
	}
	
	public UpdateAccount clickOnUpdatAccount() {
		
		driver.findElement(updateaccount).click();
		return new UpdateAccount(driver);
	}

    public AddAccount clickOnAddAccount() {
		
		driver.findElement(addaccount).click();
		return new AddAccount(driver);
	}
    
	public String welcomeMsg() {
		
		String welcommsg=elementutil.getText(WelcomeMsg);
		return welcommsg;
//		String WelconMsg= driver.findElement(WelcomeMsg).getText();
//		return WelconMsg;
	}
	
	public DeleteAccount clickOnDeleteAccount() {
		driver.findElement(DeleteAccount).click();
		return new DeleteAccount(driver);
	}
	
	public String getHomePageTitle() {
		
		 String Title=elementutil.getText(HomepageTitle);
		 return Title;
    }

	
	
	

}
