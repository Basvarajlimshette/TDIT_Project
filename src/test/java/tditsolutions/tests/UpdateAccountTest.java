package tditsolutions.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javafx.scene.control.Alert;
import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.pages.LoginPage;
import tditsolutions.pages.UpdateAccount;

public class UpdateAccountTest extends TestBase {

	

	@Test
	public void Verify_getUpdate_AccountTitle()  {
        loginPage=new LoginPage(driver);
		homePage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		updateaccount = homePage.clickOnUpdatAccount();
		String actualms = updateaccount.getUpdatepageTitle();
		Assert.assertEquals(actualms, constants.Update_Account_Page_Title);
		System.out.println("actualText" + actualms);
	}

	@Test
	public void Verify_AccountUpdated_succsessfully() throws InterruptedException  {

		homePage = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		updateaccount = homePage.clickOnUpdatAccount();
		// Verifying we are on Update Acc Page
		
		updateaccount.upadteAccount("5456462","700");
		updateaccount.clickOnUpdateBalanceBtn();

		// Verify the IsAlert Is Present or Not
		boolean actualAlert = updateaccount.IsAlertPresent();
		Assert.assertEquals(actualAlert, true);

		// Verifying Update Account AlertTExt
		String alertText = updateaccount.getAlertText();
		System.out.println("Text= " + alertText);
		Assert.assertEquals(alertText, constants.UpdateAccount_AlertMessage);
		

	}
	
	@Test
	public void Verify_HomePageButton() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		updateaccount=homePage.clickOnUpdatAccount();
		homePage=updateaccount.homePageButton();
		String actualText=homePage.welcomeMsg();
		Assert.assertEquals(actualText, constants.HomePage_WelcomMsg);
	}
	
	@Test
	public void Verify_SharesPriceUpdated_Successfully() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		updateaccount=homePage.clickOnUpdatAccount();
		updateaccount.upadteAccount("1234","8000");
		String expectedSharePrice=updateaccount.getAttributevalue();
		updateaccount.clickOnUpdateBalanceBtn();
		boolean actualFlag=updateaccount.IsAlertPresent();
		Assert.assertEquals(actualFlag, true);
		String actualText=updateaccount.getAlertText();
		Assert.assertEquals(actualText,constants.UpdateAccount_AlertMessage);
		updateaccount.searchOfAccount("1234");
		String actualSharesPrice=updateaccount.sharesupdate();
		Assert.assertEquals(actualSharesPrice, expectedSharePrice);

	}
	
	
	@Test
	public void verify_validation_Message() {
		
		homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		updateaccount=homePage.clickOnUpdatAccount();
		updateaccount.upadteAccount("524697","-2345");
		updateaccount.clickOnUpdateBalanceBtn();
		String actualValidationMessage =updateaccount.getAttributeMessage();
		Assert.assertEquals(actualValidationMessage, constants.Update_Account_Validation_Message);
		System.out.println("actual:"+actualValidationMessage);
		System.out.println("Expected:"+constants.Update_Account_Validation_Message);
	}
			
	
	
	

}
