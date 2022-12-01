package tditsolutions.tests;

import org.testng.Assert;

import org.testng.annotations.Test;

import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.DataProvider.DataProvideClass;
import tditsolutions.pages.AddAccount;
import tditsolutions.pages.HomePage;
import tditsolutions.pages.LoginPage;

public class AddAccountTest extends TestBase{
	
	@Test(dataProvider="createAccount",dataProviderClass=DataProvideClass.class)
	public void Verify_AddAccount_Page(String name,String number,String fund) {
		
	    loginPage=new LoginPage(driver);
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		addaccount=homePage.clickOnAddAccount();
		String Actualms=addaccount.getaddAccountTitle();
		Assert.assertEquals(Actualms,constants.Add_Account_Page_Title);
		addaccount.addAccount(name,number,fund);
		boolean alertPresent = addaccount.IsAlertPresent();
		Assert.assertEquals(alertPresent, true);
		String actualText=addaccount.getalertText();
		Assert.assertEquals(actualText,constants.Add_Account_ALERT_MESSAGE);

	}
	
	@Test
	public void verify_Homepage_Button() {
		
		loginPage=new LoginPage(driver);
		homePage=loginPage.doLogin("sump1","techfin@12");
		addaccount=homePage.clickOnAddAccount();
		homePage =addaccount.homePageButton();
		String actuals=homePage.welcomeMsg();
		Assert.assertEquals(actuals,constants.HomePage_WelcomMsg);
	}
	
	
	

	

}
