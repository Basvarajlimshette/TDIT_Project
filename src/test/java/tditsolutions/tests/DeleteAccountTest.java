package tditsolutions.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.pages.LoginPage;

public class DeleteAccountTest extends TestBase {
	
	@Test
	public void Verify_Account_Deleted_Succssesfully() throws InterruptedException {
		Thread.sleep(3000);
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
		deleteaccount=homePage.clickOnDeleteAccount();
		deleteaccount.deleteAccount("123495");
		boolean ActualAlert=deleteaccount.IsAlertPresent();
		Assert.assertEquals(ActualAlert, true);
		String AlertText=deleteaccount.getAlertText();
		Assert.assertEquals(AlertText,constants.Account_Deleted_Validation_Message);
		//deleteaccount.SearchDeleteAccount("12345");
		
	}
	
	@Test
	public void Verify_Incorrect_Account_Number_Entered() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		deleteaccount=homePage.clickOnDeleteAccount();
		deleteaccount.deleteAccount("-2345");
		boolean Alert=deleteaccount.IsAlertPresent();
		Assert.assertEquals(Alert, true);
		String alertText=deleteaccount.getAlertText();
		Assert.assertEquals(alertText,constants.Account_Not_Found_Validation_Message);
	}
	@Test
	public void Verify_HomePage_button() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		deleteaccount=homePage.clickOnDeleteAccount();
		homePage=deleteaccount.ClickOnHomePageButton();
	    String WelcomeMsg=homePage.welcomeMsg();
		Assert.assertEquals(WelcomeMsg,constants.HomePage_WelcomMsg);
	
	}
	
	@Test
	public void _verify_Delete_Account_Page() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		deleteaccount=homePage.clickOnDeleteAccount();
		String ActualTitle=deleteaccount.getDeteAccountPageTitle();
		Assert.assertEquals(ActualTitle,constants.Delete_Account_Page_Title);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
