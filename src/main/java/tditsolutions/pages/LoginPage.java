package tditsolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tdit.utils.Elementutil;

public class LoginPage extends Pages{
	
	By username=By.xpath("//input[@name='username']");
	
	By pass=By.xpath("//input[@name='password']");
	
	By headerTitle=By.xpath("//h1[text()='TDIT Solutions']");
	
	By LoginButton =By.xpath("//button[@name='login']");

	By WelcomeMsg=By.xpath("//h3[contains(text(),'Welcome')]");
	
	WebDriver driver;
	Elementutil elementutil;
	Pages page;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		elementutil=new Elementutil(driver);
	}
	
	
	
	public HomePage doLogin(String Username,String password) {
		
		elementutil.EneterText(username, Username);
		elementutil.EneterText(pass, password);
		elementutil.click(LoginButton);
		return new HomePage(driver);
		
//		driver.findElement(username).sendKeys(Username);
//		driver.findElement(pass).sendKeys(password);
//		driver.findElement(LoginButton).click();
		//return new HomePage(driver);
		
	}
	
	public String getHeaderTitle() {
		
		 return elementutil.getText(headerTitle);
		
//		return driver.findElement(headerTitle).getText();
	}
	
	
	public String welcomemeg() {
		
		return elementutil.getText(WelcomeMsg);
		
//		String WelconMsg= driver.findElement(WelcomeMsg).getText();
//		return WelconMsg;
	}

	
	
	
	
	
	
	
	
	
	
	

}
